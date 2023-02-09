package com.sakethh.jetspacer.localDB;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DBImplementation_Impl extends DBImplementation {
  private volatile DBService _dBService;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `newsDB` (`title` TEXT NOT NULL, `imageURL` TEXT NOT NULL, `sourceURL` TEXT NOT NULL, `sourceOfNews` TEXT NOT NULL, `publishedTime` TEXT NOT NULL, PRIMARY KEY(`sourceURL`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `apod_db` (`title` TEXT NOT NULL, `datePublished` TEXT NOT NULL, `description` TEXT NOT NULL, `imageURL` TEXT NOT NULL, `hdImageURL` TEXT NOT NULL, `mediaType` TEXT NOT NULL, `isBookMarked` INTEGER NOT NULL, `category` TEXT NOT NULL, `addedToLocalDBOn` TEXT NOT NULL, PRIMARY KEY(`imageURL`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `marsRovers_db` (`imageURL` TEXT NOT NULL, `capturedBy` TEXT NOT NULL, `sol` TEXT NOT NULL, `earthDate` TEXT NOT NULL, `roverName` TEXT NOT NULL, `roverStatus` TEXT NOT NULL, `launchingDate` TEXT NOT NULL, `landingDate` TEXT NOT NULL, `isBookMarked` INTEGER NOT NULL, `category` TEXT NOT NULL, `addedToLocalDBOn` TEXT NOT NULL, PRIMARY KEY(`imageURL`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `apiKeys` (`currentNASAAPIKey` TEXT NOT NULL, `currentNewsAPIKey` TEXT NOT NULL, `id` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '316dfc17613602a185b48ab4e37c0e0a')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `newsDB`");
        _db.execSQL("DROP TABLE IF EXISTS `apod_db`");
        _db.execSQL("DROP TABLE IF EXISTS `marsRovers_db`");
        _db.execSQL("DROP TABLE IF EXISTS `apiKeys`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsNewsDB = new HashMap<String, TableInfo.Column>(5);
        _columnsNewsDB.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsDB.put("imageURL", new TableInfo.Column("imageURL", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsDB.put("sourceURL", new TableInfo.Column("sourceURL", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsDB.put("sourceOfNews", new TableInfo.Column("sourceOfNews", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsDB.put("publishedTime", new TableInfo.Column("publishedTime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNewsDB = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNewsDB = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNewsDB = new TableInfo("newsDB", _columnsNewsDB, _foreignKeysNewsDB, _indicesNewsDB);
        final TableInfo _existingNewsDB = TableInfo.read(_db, "newsDB");
        if (! _infoNewsDB.equals(_existingNewsDB)) {
          return new RoomOpenHelper.ValidationResult(false, "newsDB(com.sakethh.jetspacer.localDB.NewsDB).\n"
                  + " Expected:\n" + _infoNewsDB + "\n"
                  + " Found:\n" + _existingNewsDB);
        }
        final HashMap<String, TableInfo.Column> _columnsApodDb = new HashMap<String, TableInfo.Column>(9);
        _columnsApodDb.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApodDb.put("datePublished", new TableInfo.Column("datePublished", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApodDb.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApodDb.put("imageURL", new TableInfo.Column("imageURL", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApodDb.put("hdImageURL", new TableInfo.Column("hdImageURL", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApodDb.put("mediaType", new TableInfo.Column("mediaType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApodDb.put("isBookMarked", new TableInfo.Column("isBookMarked", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApodDb.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApodDb.put("addedToLocalDBOn", new TableInfo.Column("addedToLocalDBOn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysApodDb = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesApodDb = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoApodDb = new TableInfo("apod_db", _columnsApodDb, _foreignKeysApodDb, _indicesApodDb);
        final TableInfo _existingApodDb = TableInfo.read(_db, "apod_db");
        if (! _infoApodDb.equals(_existingApodDb)) {
          return new RoomOpenHelper.ValidationResult(false, "apod_db(com.sakethh.jetspacer.localDB.APOD_DB_DTO).\n"
                  + " Expected:\n" + _infoApodDb + "\n"
                  + " Found:\n" + _existingApodDb);
        }
        final HashMap<String, TableInfo.Column> _columnsMarsRoversDb = new HashMap<String, TableInfo.Column>(11);
        _columnsMarsRoversDb.put("imageURL", new TableInfo.Column("imageURL", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarsRoversDb.put("capturedBy", new TableInfo.Column("capturedBy", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarsRoversDb.put("sol", new TableInfo.Column("sol", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarsRoversDb.put("earthDate", new TableInfo.Column("earthDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarsRoversDb.put("roverName", new TableInfo.Column("roverName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarsRoversDb.put("roverStatus", new TableInfo.Column("roverStatus", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarsRoversDb.put("launchingDate", new TableInfo.Column("launchingDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarsRoversDb.put("landingDate", new TableInfo.Column("landingDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarsRoversDb.put("isBookMarked", new TableInfo.Column("isBookMarked", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarsRoversDb.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarsRoversDb.put("addedToLocalDBOn", new TableInfo.Column("addedToLocalDBOn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMarsRoversDb = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMarsRoversDb = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMarsRoversDb = new TableInfo("marsRovers_db", _columnsMarsRoversDb, _foreignKeysMarsRoversDb, _indicesMarsRoversDb);
        final TableInfo _existingMarsRoversDb = TableInfo.read(_db, "marsRovers_db");
        if (! _infoMarsRoversDb.equals(_existingMarsRoversDb)) {
          return new RoomOpenHelper.ValidationResult(false, "marsRovers_db(com.sakethh.jetspacer.localDB.MarsRoversDBDTO).\n"
                  + " Expected:\n" + _infoMarsRoversDb + "\n"
                  + " Found:\n" + _existingMarsRoversDb);
        }
        final HashMap<String, TableInfo.Column> _columnsApiKeys = new HashMap<String, TableInfo.Column>(3);
        _columnsApiKeys.put("currentNASAAPIKey", new TableInfo.Column("currentNASAAPIKey", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApiKeys.put("currentNewsAPIKey", new TableInfo.Column("currentNewsAPIKey", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsApiKeys.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysApiKeys = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesApiKeys = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoApiKeys = new TableInfo("apiKeys", _columnsApiKeys, _foreignKeysApiKeys, _indicesApiKeys);
        final TableInfo _existingApiKeys = TableInfo.read(_db, "apiKeys");
        if (! _infoApiKeys.equals(_existingApiKeys)) {
          return new RoomOpenHelper.ValidationResult(false, "apiKeys(com.sakethh.jetspacer.localDB.APIKeysDB).\n"
                  + " Expected:\n" + _infoApiKeys + "\n"
                  + " Found:\n" + _existingApiKeys);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "316dfc17613602a185b48ab4e37c0e0a", "0018bb625b9dd58861ddbf63bdba90d2");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "newsDB","apod_db","marsRovers_db","apiKeys");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `newsDB`");
      _db.execSQL("DELETE FROM `apod_db`");
      _db.execSQL("DELETE FROM `marsRovers_db`");
      _db.execSQL("DELETE FROM `apiKeys`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(DBService.class, DBService_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public DBService localDBData() {
    if (_dBService != null) {
      return _dBService;
    } else {
      synchronized(this) {
        if(_dBService == null) {
          _dBService = new DBService_Impl(this);
        }
        return _dBService;
      }
    }
  }
}
