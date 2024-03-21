package com.example.sampledemoapplication.databaseHelper;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserInfo> __insertionAdapterOfUserInfo;

  private final EntityDeletionOrUpdateAdapter<UserInfo> __deletionAdapterOfUserInfo;

  private final EntityDeletionOrUpdateAdapter<UserInfo> __updateAdapterOfUserInfo;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserInfo = new EntityInsertionAdapter<UserInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `userinfo_table` (`id`,`_id`,`userName`,`emailID`,`mobileNo`,`dob`,`gender`,`location`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserInfo value) {
        stmt.bindLong(1, value.getId());
        if (value.get_id() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.get_id());
        }
        if (value.getUserName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUserName());
        }
        if (value.getEmailID() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmailID());
        }
        if (value.getMobileNo() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMobileNo());
        }
        if (value.getDob() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDob());
        }
        if (value.getGender() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getGender());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLocation());
        }
      }
    };
    this.__deletionAdapterOfUserInfo = new EntityDeletionOrUpdateAdapter<UserInfo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `userinfo_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserInfo value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfUserInfo = new EntityDeletionOrUpdateAdapter<UserInfo>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `userinfo_table` SET `id` = ?,`_id` = ?,`userName` = ?,`emailID` = ?,`mobileNo` = ?,`dob` = ?,`gender` = ?,`location` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserInfo value) {
        stmt.bindLong(1, value.getId());
        if (value.get_id() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.get_id());
        }
        if (value.getUserName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUserName());
        }
        if (value.getEmailID() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmailID());
        }
        if (value.getMobileNo() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMobileNo());
        }
        if (value.getDob() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDob());
        }
        if (value.getGender() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getGender());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLocation());
        }
        stmt.bindLong(9, value.getId());
      }
    };
  }

  @Override
  public Object InsertUserDetails(final UserInfo userInfo,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserInfo.insert(userInfo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteUser(final UserInfo userInfo, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfUserInfo.handle(userInfo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateUser(final UserInfo userInfo, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfUserInfo.handle(userInfo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public List<UserInfo> getAllUsersDetails() {
    final String _sql = "SELECT * FROM userinfo_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "userName");
      final int _cursorIndexOfEmailID = CursorUtil.getColumnIndexOrThrow(_cursor, "emailID");
      final int _cursorIndexOfMobileNo = CursorUtil.getColumnIndexOrThrow(_cursor, "mobileNo");
      final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "dob");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
      final List<UserInfo> _result = new ArrayList<UserInfo>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserInfo _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmp_id;
        if (_cursor.isNull(_cursorIndexOfId_1)) {
          _tmp_id = null;
        } else {
          _tmp_id = _cursor.getString(_cursorIndexOfId_1);
        }
        final String _tmpUserName;
        if (_cursor.isNull(_cursorIndexOfUserName)) {
          _tmpUserName = null;
        } else {
          _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
        }
        final String _tmpEmailID;
        if (_cursor.isNull(_cursorIndexOfEmailID)) {
          _tmpEmailID = null;
        } else {
          _tmpEmailID = _cursor.getString(_cursorIndexOfEmailID);
        }
        final String _tmpMobileNo;
        if (_cursor.isNull(_cursorIndexOfMobileNo)) {
          _tmpMobileNo = null;
        } else {
          _tmpMobileNo = _cursor.getString(_cursorIndexOfMobileNo);
        }
        final String _tmpDob;
        if (_cursor.isNull(_cursorIndexOfDob)) {
          _tmpDob = null;
        } else {
          _tmpDob = _cursor.getString(_cursorIndexOfDob);
        }
        final String _tmpGender;
        if (_cursor.isNull(_cursorIndexOfGender)) {
          _tmpGender = null;
        } else {
          _tmpGender = _cursor.getString(_cursorIndexOfGender);
        }
        final String _tmpLocation;
        if (_cursor.isNull(_cursorIndexOfLocation)) {
          _tmpLocation = null;
        } else {
          _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
        }
        _item = new UserInfo(_tmpId,_tmp_id,_tmpUserName,_tmpEmailID,_tmpMobileNo,_tmpDob,_tmpGender,_tmpLocation);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<UserInfo>> getAllUsersDetailsLocal() {
    final String _sql = "SELECT * FROM userinfo_table ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"userinfo_table"}, false, new Callable<List<UserInfo>>() {
      @Override
      public List<UserInfo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "userName");
          final int _cursorIndexOfEmailID = CursorUtil.getColumnIndexOrThrow(_cursor, "emailID");
          final int _cursorIndexOfMobileNo = CursorUtil.getColumnIndexOrThrow(_cursor, "mobileNo");
          final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "dob");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final List<UserInfo> _result = new ArrayList<UserInfo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserInfo _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmp_id;
            if (_cursor.isNull(_cursorIndexOfId_1)) {
              _tmp_id = null;
            } else {
              _tmp_id = _cursor.getString(_cursorIndexOfId_1);
            }
            final String _tmpUserName;
            if (_cursor.isNull(_cursorIndexOfUserName)) {
              _tmpUserName = null;
            } else {
              _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
            }
            final String _tmpEmailID;
            if (_cursor.isNull(_cursorIndexOfEmailID)) {
              _tmpEmailID = null;
            } else {
              _tmpEmailID = _cursor.getString(_cursorIndexOfEmailID);
            }
            final String _tmpMobileNo;
            if (_cursor.isNull(_cursorIndexOfMobileNo)) {
              _tmpMobileNo = null;
            } else {
              _tmpMobileNo = _cursor.getString(_cursorIndexOfMobileNo);
            }
            final String _tmpDob;
            if (_cursor.isNull(_cursorIndexOfDob)) {
              _tmpDob = null;
            } else {
              _tmpDob = _cursor.getString(_cursorIndexOfDob);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            _item = new UserInfo(_tmpId,_tmp_id,_tmpUserName,_tmpEmailID,_tmpMobileNo,_tmpDob,_tmpGender,_tmpLocation);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
