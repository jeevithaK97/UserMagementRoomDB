package com.example.sampledemoapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sampledemoapplication.view.MainActivity
import com.example.sampledemoapplication.databaseHelper.UserInfo
import com.example.sampledemoapplication.databinding.UserItemListBinding

class UserListAdapter(
    var userList: List<UserInfo>,
    private val itemClickListener: MainActivity
) :
    RecyclerView.Adapter<UserListAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = UserItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.bind(user)
        holder.itemView.setOnClickListener {
            itemClickListener.onItemClick(user)
        }
    }

    inner class UserViewHolder(private val binding: UserItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(user: UserInfo) {
            binding.userNameTV.text = user.userName.ifEmpty { "-" }
            binding.genderTV.text = user.gender.ifEmpty { "-" }
            binding.mobileNoTV.text = user.mobileNo.ifEmpty { "-" }
            binding.emailTV.text = user.emailID.ifEmpty { "-" }

            binding.editBtn.setOnClickListener {
                itemClickListener.onEditItemClick(user)
            }
            binding.deleteBtn.setOnClickListener {
                itemClickListener.onDeleteItemClick(user)
            }
        }
    }
}

interface UserItemClickListener {
    fun onItemClick(user: UserInfo)
    fun onEditItemClick(userId: UserInfo)
    fun onDeleteItemClick(userId: UserInfo)
}
