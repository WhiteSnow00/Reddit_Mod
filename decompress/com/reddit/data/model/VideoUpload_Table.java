// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import android.database.CursorWrapper;
import com.raizlabs.android.dbflow.sql.language.BaseQueriable;
import com.raizlabs.android.dbflow.sql.language.BaseTransformable;
import com.raizlabs.android.dbflow.structure.database.FlowCursor;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.OperatorGroup;
import com.raizlabs.android.dbflow.sql.language.SQLOperator;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.sql.saveable.AutoIncrementModelSaver;
import com.raizlabs.android.dbflow.sql.saveable.ModelSaver;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import android.content.ContentValues;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.structure.ModelAdapter;

public final class VideoUpload_Table extends ModelAdapter<VideoUpload>
{
    public static final IProperty[] ALL_COLUMN_PROPERTIES;
    public static final Property<Integer> attempts;
    public static final Property<String> bodyText;
    public static final Property<String> discussionType;
    public static final Property<Integer> duration;
    public static final Property<String> filePath;
    public static final Property<String> flairId;
    public static final Property<String> flairText;
    public static final Property<Boolean> gif;
    public static final Property<Integer> id;
    public static final Property<Boolean> isNsfw;
    public static final Property<Boolean> isReactAllowed;
    public static final Property<Boolean> isSpoiler;
    public static final Property<Integer> originalDuration;
    public static final Property<String> parentPostId;
    public static final Property<String> posterUrl;
    public static final Property<String> requestId;
    public static final Property<String> source;
    public static final Property<Integer> status;
    public static final Property<String> subreddit;
    public static final Property<String> thumbnail;
    public static final Property<Long> timestamp;
    public static final Property<String> title;
    public static final Property<Long> uploadDuration;
    public static final Property<String> uploadError;
    public static final Property<String> uploadUrl;
    public static final Property<Integer> videoHeight;
    public static final Property<String> videoKey;
    public static final Property<Integer> videoWidth;
    
    static {
        ALL_COLUMN_PROPERTIES = new IProperty[] { (IProperty)(id = new Property((Class)VideoUpload.class, "id")), (IProperty)(requestId = new Property((Class)VideoUpload.class, "requestId")), (IProperty)(filePath = new Property((Class)VideoUpload.class, "filePath")), (IProperty)(title = new Property((Class)VideoUpload.class, "title")), (IProperty)(subreddit = new Property((Class)VideoUpload.class, "subreddit")), (IProperty)(uploadUrl = new Property((Class)VideoUpload.class, "uploadUrl")), (IProperty)(posterUrl = new Property((Class)VideoUpload.class, "posterUrl")), (IProperty)(thumbnail = new Property((Class)VideoUpload.class, "thumbnail")), (IProperty)(videoKey = new Property((Class)VideoUpload.class, "videoKey")), (IProperty)(timestamp = new Property((Class)VideoUpload.class, "timestamp")), (IProperty)(status = new Property((Class)VideoUpload.class, "status")), (IProperty)(gif = new Property((Class)VideoUpload.class, "gif")), (IProperty)(attempts = new Property((Class)VideoUpload.class, "attempts")), (IProperty)(originalDuration = new Property((Class)VideoUpload.class, "originalDuration")), (IProperty)(duration = new Property((Class)VideoUpload.class, "duration")), (IProperty)(source = new Property((Class)VideoUpload.class, "source")), (IProperty)(uploadDuration = new Property((Class)VideoUpload.class, "uploadDuration")), (IProperty)(uploadError = new Property((Class)VideoUpload.class, "uploadError")), (IProperty)(videoWidth = new Property((Class)VideoUpload.class, "videoWidth")), (IProperty)(videoHeight = new Property((Class)VideoUpload.class, "videoHeight")), (IProperty)(flairText = new Property((Class)VideoUpload.class, "flairText")), (IProperty)(flairId = new Property((Class)VideoUpload.class, "flairId")), (IProperty)(discussionType = new Property((Class)VideoUpload.class, "discussionType")), (IProperty)(isNsfw = new Property((Class)VideoUpload.class, "isNsfw")), (IProperty)(isSpoiler = new Property((Class)VideoUpload.class, "isSpoiler")), (IProperty)(parentPostId = new Property((Class)VideoUpload.class, "parentPostId")), (IProperty)(isReactAllowed = new Property((Class)VideoUpload.class, "isReactAllowed")), (IProperty)(bodyText = new Property((Class)VideoUpload.class, "bodyText")) };
    }
    
    public VideoUpload_Table(final DatabaseDefinition databaseDefinition) {
        super(databaseDefinition);
    }
    
    public final void bindToContentValues(final ContentValues contentValues, final VideoUpload videoUpload) {
        contentValues.put("`id`", Integer.valueOf(videoUpload.id));
        this.bindToInsertValues(contentValues, videoUpload);
    }
    
    public final void bindToDeleteStatement(final DatabaseStatement databaseStatement, final VideoUpload videoUpload) {
        databaseStatement.bindLong(1, (long)videoUpload.id);
    }
    
    public final void bindToInsertStatement(final DatabaseStatement databaseStatement, final VideoUpload videoUpload, final int n) {
        databaseStatement.bindStringOrNull(n + 1, videoUpload.requestId);
        databaseStatement.bindStringOrNull(n + 2, videoUpload.filePath);
        databaseStatement.bindStringOrNull(n + 3, videoUpload.title);
        databaseStatement.bindStringOrNull(n + 4, videoUpload.subreddit);
        databaseStatement.bindStringOrNull(n + 5, videoUpload.uploadUrl);
        databaseStatement.bindStringOrNull(n + 6, videoUpload.posterUrl);
        databaseStatement.bindStringOrNull(n + 7, videoUpload.thumbnail);
        databaseStatement.bindStringOrNull(n + 8, videoUpload.videoKey);
        databaseStatement.bindLong(n + 9, videoUpload.timestamp);
        databaseStatement.bindLong(n + 10, (long)videoUpload.status);
        final boolean gif = videoUpload.gif;
        final long n2 = 1L;
        long n3;
        if (gif) {
            n3 = 1L;
        }
        else {
            n3 = 0L;
        }
        databaseStatement.bindLong(n + 11, n3);
        databaseStatement.bindLong(n + 12, (long)videoUpload.attempts);
        databaseStatement.bindLong(n + 13, (long)videoUpload.originalDuration);
        databaseStatement.bindLong(n + 14, (long)videoUpload.duration);
        databaseStatement.bindStringOrNull(n + 15, videoUpload.source);
        databaseStatement.bindLong(n + 16, videoUpload.uploadDuration);
        databaseStatement.bindStringOrNull(n + 17, videoUpload.uploadError);
        databaseStatement.bindLong(n + 18, (long)videoUpload.videoWidth);
        databaseStatement.bindLong(n + 19, (long)videoUpload.videoHeight);
        databaseStatement.bindStringOrNull(n + 20, videoUpload.flairText);
        databaseStatement.bindStringOrNull(n + 21, videoUpload.flairId);
        databaseStatement.bindStringOrNull(n + 22, videoUpload.discussionType);
        long n4;
        if (videoUpload.isNsfw) {
            n4 = 1L;
        }
        else {
            n4 = 0L;
        }
        databaseStatement.bindLong(n + 23, n4);
        long n5;
        if (videoUpload.isSpoiler) {
            n5 = 1L;
        }
        else {
            n5 = 0L;
        }
        databaseStatement.bindLong(n + 24, n5);
        databaseStatement.bindStringOrNull(n + 25, videoUpload.parentPostId);
        long n6;
        if (videoUpload.isReactAllowed) {
            n6 = n2;
        }
        else {
            n6 = 0L;
        }
        databaseStatement.bindLong(n + 26, n6);
        databaseStatement.bindStringOrNull(n + 27, videoUpload.bodyText);
    }
    
    public final void bindToInsertValues(final ContentValues contentValues, final VideoUpload videoUpload) {
        contentValues.put("`requestId`", videoUpload.requestId);
        contentValues.put("`filePath`", videoUpload.filePath);
        contentValues.put("`title`", videoUpload.title);
        contentValues.put("`subreddit`", videoUpload.subreddit);
        contentValues.put("`uploadUrl`", videoUpload.uploadUrl);
        contentValues.put("`posterUrl`", videoUpload.posterUrl);
        contentValues.put("`thumbnail`", videoUpload.thumbnail);
        contentValues.put("`videoKey`", videoUpload.videoKey);
        contentValues.put("`timestamp`", Long.valueOf(videoUpload.timestamp));
        contentValues.put("`status`", Integer.valueOf(videoUpload.status));
        contentValues.put("`gif`", Integer.valueOf((int)(videoUpload.gif ? 1 : 0)));
        contentValues.put("`attempts`", Integer.valueOf(videoUpload.attempts));
        contentValues.put("`originalDuration`", Integer.valueOf(videoUpload.originalDuration));
        contentValues.put("`duration`", Integer.valueOf(videoUpload.duration));
        contentValues.put("`source`", videoUpload.source);
        contentValues.put("`uploadDuration`", Long.valueOf(videoUpload.uploadDuration));
        contentValues.put("`uploadError`", videoUpload.uploadError);
        contentValues.put("`videoWidth`", Integer.valueOf(videoUpload.videoWidth));
        contentValues.put("`videoHeight`", Integer.valueOf(videoUpload.videoHeight));
        contentValues.put("`flairText`", videoUpload.flairText);
        contentValues.put("`flairId`", videoUpload.flairId);
        contentValues.put("`discussionType`", videoUpload.discussionType);
        contentValues.put("`isNsfw`", Integer.valueOf((int)(videoUpload.isNsfw ? 1 : 0)));
        contentValues.put("`isSpoiler`", Integer.valueOf((int)(videoUpload.isSpoiler ? 1 : 0)));
        contentValues.put("`parentPostId`", videoUpload.parentPostId);
        contentValues.put("`isReactAllowed`", Integer.valueOf((int)(videoUpload.isReactAllowed ? 1 : 0)));
        contentValues.put("`bodyText`", videoUpload.bodyText);
    }
    
    public final void bindToStatement(final DatabaseStatement databaseStatement, final VideoUpload videoUpload) {
        databaseStatement.bindLong(1, (long)videoUpload.id);
        this.bindToInsertStatement(databaseStatement, videoUpload, 1);
    }
    
    public final void bindToUpdateStatement(final DatabaseStatement databaseStatement, final VideoUpload videoUpload) {
        databaseStatement.bindLong(1, (long)videoUpload.id);
        databaseStatement.bindStringOrNull(2, videoUpload.requestId);
        databaseStatement.bindStringOrNull(3, videoUpload.filePath);
        databaseStatement.bindStringOrNull(4, videoUpload.title);
        databaseStatement.bindStringOrNull(5, videoUpload.subreddit);
        databaseStatement.bindStringOrNull(6, videoUpload.uploadUrl);
        databaseStatement.bindStringOrNull(7, videoUpload.posterUrl);
        databaseStatement.bindStringOrNull(8, videoUpload.thumbnail);
        databaseStatement.bindStringOrNull(9, videoUpload.videoKey);
        databaseStatement.bindLong(10, videoUpload.timestamp);
        databaseStatement.bindLong(11, (long)videoUpload.status);
        final boolean gif = videoUpload.gif;
        final long n = 1L;
        long n2;
        if (gif) {
            n2 = 1L;
        }
        else {
            n2 = 0L;
        }
        databaseStatement.bindLong(12, n2);
        databaseStatement.bindLong(13, (long)videoUpload.attempts);
        databaseStatement.bindLong(14, (long)videoUpload.originalDuration);
        databaseStatement.bindLong(15, (long)videoUpload.duration);
        databaseStatement.bindStringOrNull(16, videoUpload.source);
        databaseStatement.bindLong(17, videoUpload.uploadDuration);
        databaseStatement.bindStringOrNull(18, videoUpload.uploadError);
        databaseStatement.bindLong(19, (long)videoUpload.videoWidth);
        databaseStatement.bindLong(20, (long)videoUpload.videoHeight);
        databaseStatement.bindStringOrNull(21, videoUpload.flairText);
        databaseStatement.bindStringOrNull(22, videoUpload.flairId);
        databaseStatement.bindStringOrNull(23, videoUpload.discussionType);
        long n3;
        if (videoUpload.isNsfw) {
            n3 = 1L;
        }
        else {
            n3 = 0L;
        }
        databaseStatement.bindLong(24, n3);
        long n4;
        if (videoUpload.isSpoiler) {
            n4 = 1L;
        }
        else {
            n4 = 0L;
        }
        databaseStatement.bindLong(25, n4);
        databaseStatement.bindStringOrNull(26, videoUpload.parentPostId);
        long n5;
        if (videoUpload.isReactAllowed) {
            n5 = n;
        }
        else {
            n5 = 0L;
        }
        databaseStatement.bindLong(27, n5);
        databaseStatement.bindStringOrNull(28, videoUpload.bodyText);
        databaseStatement.bindLong(29, (long)videoUpload.id);
    }
    
    public final ModelSaver<VideoUpload> createSingleModelSaver() {
        return (ModelSaver<VideoUpload>)new AutoIncrementModelSaver();
    }
    
    public final boolean exists(final VideoUpload videoUpload, final DatabaseWrapper databaseWrapper) {
        final int id = videoUpload.id;
        boolean b = true;
        if (id <= 0 || !((BaseQueriable)((BaseTransformable)SQLite.selectCountOf(new IProperty[0]).from((Class)VideoUpload.class)).where(new SQLOperator[] { (SQLOperator)this.getPrimaryConditionClause(videoUpload) })).hasData(databaseWrapper)) {
            b = false;
        }
        return b;
    }
    
    public final IProperty[] getAllColumnProperties() {
        return VideoUpload_Table.ALL_COLUMN_PROPERTIES;
    }
    
    public final String getAutoIncrementingColumnName() {
        return "id";
    }
    
    public final Number getAutoIncrementingId(final VideoUpload videoUpload) {
        return videoUpload.id;
    }
    
    public final String getCompiledStatementQuery() {
        return "INSERT INTO `video_upload`(`id`,`requestId`,`filePath`,`title`,`subreddit`,`uploadUrl`,`posterUrl`,`thumbnail`,`videoKey`,`timestamp`,`status`,`gif`,`attempts`,`originalDuration`,`duration`,`source`,`uploadDuration`,`uploadError`,`videoWidth`,`videoHeight`,`flairText`,`flairId`,`discussionType`,`isNsfw`,`isSpoiler`,`parentPostId`,`isReactAllowed`,`bodyText`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
    
    public final String getCreationQuery() {
        return "CREATE TABLE IF NOT EXISTS `video_upload`(`id` INTEGER PRIMARY KEY AUTOINCREMENT, `requestId` TEXT, `filePath` TEXT, `title` TEXT, `subreddit` TEXT, `uploadUrl` TEXT, `posterUrl` TEXT, `thumbnail` TEXT, `videoKey` TEXT, `timestamp` INTEGER, `status` INTEGER, `gif` INTEGER, `attempts` INTEGER, `originalDuration` INTEGER, `duration` INTEGER, `source` TEXT, `uploadDuration` INTEGER, `uploadError` TEXT, `videoWidth` INTEGER, `videoHeight` INTEGER, `flairText` TEXT, `flairId` TEXT, `discussionType` TEXT, `isNsfw` INTEGER, `isSpoiler` INTEGER, `parentPostId` TEXT, `isReactAllowed` INTEGER, `bodyText` TEXT)";
    }
    
    public final String getDeleteStatementQuery() {
        return "DELETE FROM `video_upload` WHERE `id`=?";
    }
    
    public final String getInsertStatementQuery() {
        return "INSERT INTO `video_upload`(`requestId`,`filePath`,`title`,`subreddit`,`uploadUrl`,`posterUrl`,`thumbnail`,`videoKey`,`timestamp`,`status`,`gif`,`attempts`,`originalDuration`,`duration`,`source`,`uploadDuration`,`uploadError`,`videoWidth`,`videoHeight`,`flairText`,`flairId`,`discussionType`,`isNsfw`,`isSpoiler`,`parentPostId`,`isReactAllowed`,`bodyText`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
    
    public final Class<VideoUpload> getModelClass() {
        return VideoUpload.class;
    }
    
    public final OperatorGroup getPrimaryConditionClause(final VideoUpload videoUpload) {
        final OperatorGroup clause = OperatorGroup.clause();
        clause.and((SQLOperator)VideoUpload_Table.id.eq((Object)videoUpload.id));
        return clause;
    }
    
    public final Property getProperty(String quoteIfNeeded) {
        quoteIfNeeded = QueryBuilder.quoteIfNeeded(quoteIfNeeded);
        quoteIfNeeded.getClass();
        final int hashCode = quoteIfNeeded.hashCode();
        int n = -1;
        switch (hashCode) {
            case 2079158085: {
                if (!quoteIfNeeded.equals("`source`")) {
                    break;
                }
                n = 27;
                break;
            }
            case 1883166036: {
                if (!quoteIfNeeded.equals("`thumbnail`")) {
                    break;
                }
                n = 26;
                break;
            }
            case 1872588384: {
                if (!quoteIfNeeded.equals("`isNsfw`")) {
                    break;
                }
                n = 25;
                break;
            }
            case 1549786091: {
                if (!quoteIfNeeded.equals("`uploadDuration`")) {
                    break;
                }
                n = 24;
                break;
            }
            case 1523242978: {
                if (!quoteIfNeeded.equals("`subreddit`")) {
                    break;
                }
                n = 23;
                break;
            }
            case 1423111198: {
                if (!quoteIfNeeded.equals("`posterUrl`")) {
                    break;
                }
                n = 22;
                break;
            }
            case 1278850143: {
                if (!quoteIfNeeded.equals("`filePath`")) {
                    break;
                }
                n = 21;
                break;
            }
            case 1000276586: {
                if (!quoteIfNeeded.equals("`timestamp`")) {
                    break;
                }
                n = 20;
                break;
            }
            case 986697964: {
                if (!quoteIfNeeded.equals("`duration`")) {
                    break;
                }
                n = 19;
                break;
            }
            case 952104584: {
                if (!quoteIfNeeded.equals("`isSpoiler`")) {
                    break;
                }
                n = 18;
                break;
            }
            case 653920085: {
                if (!quoteIfNeeded.equals("`videoWidth`")) {
                    break;
                }
                n = 17;
                break;
            }
            case 585972926: {
                if (!quoteIfNeeded.equals("`discussionType`")) {
                    break;
                }
                n = 16;
                break;
            }
            case 91830652: {
                if (!quoteIfNeeded.equals("`gif`")) {
                    break;
                }
                n = 15;
                break;
            }
            case 2964037: {
                if (!quoteIfNeeded.equals("`id`")) {
                    break;
                }
                n = 14;
                break;
            }
            case -100324959: {
                if (!quoteIfNeeded.equals("`flairId`")) {
                    break;
                }
                n = 13;
                break;
            }
            case -192637671: {
                if (!quoteIfNeeded.equals("`uploadError`")) {
                    break;
                }
                n = 12;
                break;
            }
            case -352752484: {
                if (!quoteIfNeeded.equals("`videoKey`")) {
                    break;
                }
                n = 11;
                break;
            }
            case -443000847: {
                if (!quoteIfNeeded.equals("`bodyText`")) {
                    break;
                }
                n = 10;
                break;
            }
            case -648082195: {
                if (!quoteIfNeeded.equals("`isReactAllowed`")) {
                    break;
                }
                n = 9;
                break;
            }
            case -671549962: {
                if (!quoteIfNeeded.equals("`requestId`")) {
                    break;
                }
                n = 8;
                break;
            }
            case -951678254: {
                if (!quoteIfNeeded.equals("`uploadUrl`")) {
                    break;
                }
                n = 7;
                break;
            }
            case -1191822981: {
                if (!quoteIfNeeded.equals("`parentPostId`")) {
                    break;
                }
                n = 6;
                break;
            }
            case -1572445848: {
                if (!quoteIfNeeded.equals("`title`")) {
                    break;
                }
                n = 5;
                break;
            }
            case -1741252738: {
                if (!quoteIfNeeded.equals("`videoHeight`")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1862712805: {
                if (!quoteIfNeeded.equals("`originalDuration`")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1912789809: {
                if (!quoteIfNeeded.equals("`flairText`")) {
                    break;
                }
                n = 2;
                break;
            }
            case -2040410758: {
                if (!quoteIfNeeded.equals("`attempts`")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2091056562: {
                if (!quoteIfNeeded.equals("`status`")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
            }
            case 27: {
                return VideoUpload_Table.source;
            }
            case 26: {
                return VideoUpload_Table.thumbnail;
            }
            case 25: {
                return VideoUpload_Table.isNsfw;
            }
            case 24: {
                return VideoUpload_Table.uploadDuration;
            }
            case 23: {
                return VideoUpload_Table.subreddit;
            }
            case 22: {
                return VideoUpload_Table.posterUrl;
            }
            case 21: {
                return VideoUpload_Table.filePath;
            }
            case 20: {
                return VideoUpload_Table.timestamp;
            }
            case 19: {
                return VideoUpload_Table.duration;
            }
            case 18: {
                return VideoUpload_Table.isSpoiler;
            }
            case 17: {
                return VideoUpload_Table.videoWidth;
            }
            case 16: {
                return VideoUpload_Table.discussionType;
            }
            case 15: {
                return VideoUpload_Table.gif;
            }
            case 14: {
                return VideoUpload_Table.id;
            }
            case 13: {
                return VideoUpload_Table.flairId;
            }
            case 12: {
                return VideoUpload_Table.uploadError;
            }
            case 11: {
                return VideoUpload_Table.videoKey;
            }
            case 10: {
                return VideoUpload_Table.bodyText;
            }
            case 9: {
                return VideoUpload_Table.isReactAllowed;
            }
            case 8: {
                return VideoUpload_Table.requestId;
            }
            case 7: {
                return VideoUpload_Table.uploadUrl;
            }
            case 6: {
                return VideoUpload_Table.parentPostId;
            }
            case 5: {
                return VideoUpload_Table.title;
            }
            case 4: {
                return VideoUpload_Table.videoHeight;
            }
            case 3: {
                return VideoUpload_Table.originalDuration;
            }
            case 2: {
                return VideoUpload_Table.flairText;
            }
            case 1: {
                return VideoUpload_Table.attempts;
            }
            case 0: {
                return VideoUpload_Table.status;
            }
        }
    }
    
    public final String getTableName() {
        return "`video_upload`";
    }
    
    public final String getUpdateStatementQuery() {
        return "UPDATE `video_upload` SET `id`=?,`requestId`=?,`filePath`=?,`title`=?,`subreddit`=?,`uploadUrl`=?,`posterUrl`=?,`thumbnail`=?,`videoKey`=?,`timestamp`=?,`status`=?,`gif`=?,`attempts`=?,`originalDuration`=?,`duration`=?,`source`=?,`uploadDuration`=?,`uploadError`=?,`videoWidth`=?,`videoHeight`=?,`flairText`=?,`flairId`=?,`discussionType`=?,`isNsfw`=?,`isSpoiler`=?,`parentPostId`=?,`isReactAllowed`=?,`bodyText`=? WHERE `id`=?";
    }
    
    public final void loadFromCursor(final FlowCursor flowCursor, final VideoUpload videoUpload) {
        videoUpload.id = flowCursor.getIntOrDefault("id");
        videoUpload.requestId = flowCursor.getStringOrDefault("requestId");
        videoUpload.filePath = flowCursor.getStringOrDefault("filePath");
        videoUpload.title = flowCursor.getStringOrDefault("title");
        videoUpload.subreddit = flowCursor.getStringOrDefault("subreddit");
        videoUpload.uploadUrl = flowCursor.getStringOrDefault("uploadUrl");
        videoUpload.posterUrl = flowCursor.getStringOrDefault("posterUrl");
        videoUpload.thumbnail = flowCursor.getStringOrDefault("thumbnail");
        videoUpload.videoKey = flowCursor.getStringOrDefault("videoKey");
        videoUpload.timestamp = flowCursor.getLongOrDefault("timestamp");
        videoUpload.status = flowCursor.getIntOrDefault("status");
        final int columnIndex = ((CursorWrapper)flowCursor).getColumnIndex("gif");
        if (columnIndex != -1 && !((CursorWrapper)flowCursor).isNull(columnIndex)) {
            videoUpload.gif = flowCursor.getBoolean(columnIndex);
        }
        else {
            videoUpload.gif = false;
        }
        videoUpload.attempts = flowCursor.getIntOrDefault("attempts");
        videoUpload.originalDuration = flowCursor.getIntOrDefault("originalDuration");
        videoUpload.duration = flowCursor.getIntOrDefault("duration");
        videoUpload.source = flowCursor.getStringOrDefault("source");
        videoUpload.uploadDuration = flowCursor.getLongOrDefault("uploadDuration");
        videoUpload.uploadError = flowCursor.getStringOrDefault("uploadError");
        videoUpload.videoWidth = flowCursor.getIntOrDefault("videoWidth");
        videoUpload.videoHeight = flowCursor.getIntOrDefault("videoHeight");
        videoUpload.flairText = flowCursor.getStringOrDefault("flairText");
        videoUpload.flairId = flowCursor.getStringOrDefault("flairId");
        videoUpload.discussionType = flowCursor.getStringOrDefault("discussionType");
        final int columnIndex2 = ((CursorWrapper)flowCursor).getColumnIndex("isNsfw");
        if (columnIndex2 != -1 && !((CursorWrapper)flowCursor).isNull(columnIndex2)) {
            videoUpload.isNsfw = flowCursor.getBoolean(columnIndex2);
        }
        else {
            videoUpload.isNsfw = false;
        }
        final int columnIndex3 = ((CursorWrapper)flowCursor).getColumnIndex("isSpoiler");
        if (columnIndex3 != -1 && !((CursorWrapper)flowCursor).isNull(columnIndex3)) {
            videoUpload.isSpoiler = flowCursor.getBoolean(columnIndex3);
        }
        else {
            videoUpload.isSpoiler = false;
        }
        videoUpload.parentPostId = flowCursor.getStringOrDefault("parentPostId");
        final int columnIndex4 = ((CursorWrapper)flowCursor).getColumnIndex("isReactAllowed");
        if (columnIndex4 != -1 && !((CursorWrapper)flowCursor).isNull(columnIndex4)) {
            videoUpload.isReactAllowed = flowCursor.getBoolean(columnIndex4);
        }
        else {
            videoUpload.isReactAllowed = false;
        }
        videoUpload.bodyText = flowCursor.getStringOrDefault("bodyText");
    }
    
    public final VideoUpload newInstance() {
        return new VideoUpload();
    }
    
    public final void updateAutoIncrement(final VideoUpload videoUpload, final Number n) {
        videoUpload.id = n.intValue();
    }
}
