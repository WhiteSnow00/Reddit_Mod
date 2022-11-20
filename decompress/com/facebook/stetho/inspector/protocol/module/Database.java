// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.json.annotation.JsonProperty;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.common.Util;
import java.io.UnsupportedEncodingException;
import android.database.Cursor;
import com.facebook.stetho.inspector.helper.PeerRegistrationListener;
import java.util.ArrayList;
import com.facebook.stetho.json.ObjectMapper;
import java.util.List;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class Database implements ChromeDevtoolsDomain
{
    private static final int MAX_BLOB_LENGTH = 512;
    private static final int MAX_EXECUTE_RESULTS = 250;
    private static final String UNKNOWN_BLOB_LABEL = "{blob}";
    private final ChromePeerManager mChromePeerManager;
    private List<DatabaseDriver2> mDatabaseDrivers;
    private final ObjectMapper mObjectMapper;
    private final Database.Database$DatabasePeerRegistrationListener mPeerListener;
    
    public Database() {
        this.mDatabaseDrivers = new ArrayList<DatabaseDriver2>();
        (this.mChromePeerManager = new ChromePeerManager()).setListener((PeerRegistrationListener)(this.mPeerListener = new Database.Database$DatabasePeerRegistrationListener((List)this.mDatabaseDrivers, (Database$1)null)));
        this.mObjectMapper = new ObjectMapper();
    }
    
    public static ArrayList access$200(final Cursor cursor, final int n) {
        return flattenRows(cursor, n);
    }
    
    private static String blobToString(final byte[] array) {
        if (array.length > 512 || !fastIsAscii(array)) {
            return "{blob}";
        }
        try {
            return new String(array, "US-ASCII");
        }
        catch (final UnsupportedEncodingException ex) {
            return "{blob}";
        }
    }
    
    private static boolean fastIsAscii(final byte[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if ((array[i] & 0xFFFFFF80) != 0x0) {
                return false;
            }
        }
        return true;
    }
    
    private static ArrayList<String> flattenRows(final Cursor cursor, int i) {
        final int n = 0;
        Util.throwIfNot(i >= 0);
        final ArrayList<String> list = new ArrayList<String>();
        final int columnCount = cursor.getColumnCount();
        for (int n2 = 0; n2 < i && cursor.moveToNext(); ++n2) {
            for (int j = 0; j < columnCount; ++j) {
                final int type = cursor.getType(j);
                if (type != 0) {
                    if (type != 1) {
                        if (type != 2) {
                            if (type != 4) {
                                list.add(cursor.getString(j));
                            }
                            else {
                                list.add(blobToString(cursor.getBlob(j)));
                            }
                        }
                        else {
                            list.add(String.valueOf(cursor.getDouble(j)));
                        }
                    }
                    else {
                        list.add(String.valueOf(cursor.getLong(j)));
                    }
                }
                else {
                    list.add(null);
                }
            }
        }
        if (!cursor.isAfterLast()) {
            for (i = n; i < columnCount; ++i) {
                list.add("{truncated}");
            }
        }
        return list;
    }
    
    public void add(final DatabaseDriver2 databaseDriver2) {
        this.mDatabaseDrivers.add(databaseDriver2);
    }
    
    @ChromeDevtoolsMethod
    public void disable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        this.mChromePeerManager.removePeer(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public void enable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        this.mChromePeerManager.addPeer(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult executeSQL(JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        jsonRpcPeer = (JsonRpcPeer)this.mObjectMapper.convertValue((Object)jsonObject, (Class)Database.Database$ExecuteSQLRequest.class);
        final Database.Database$DatabaseDescriptorHolder databaseDescriptorHolder = this.mPeerListener.getDatabaseDescriptorHolder(((Database.Database$ExecuteSQLRequest)jsonRpcPeer).databaseId);
        try {
            return (JsonRpcResult)databaseDescriptorHolder.driver.executeSQL((Object)databaseDescriptorHolder.descriptor, ((Database.Database$ExecuteSQLRequest)jsonRpcPeer).query, (BaseDatabaseDriver$ExecuteResultHandler)new Database$1(this));
        }
        catch (final RuntimeException ex) {
            LogUtil.e((Throwable)ex, "Exception executing: %s", new Object[] { ((Database.Database$ExecuteSQLRequest)jsonRpcPeer).query });
            final Database$Error sqlError = new Database$Error();
            sqlError.code = 0;
            sqlError.message = ex.getMessage();
            final ExecuteSQLResponse executeSQLResponse = new ExecuteSQLResponse();
            executeSQLResponse.sqlError = sqlError;
            return (JsonRpcResult)executeSQLResponse;
        }
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult getDatabaseTableNames(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws JsonRpcException {
        final Database.Database$DatabaseDescriptorHolder databaseDescriptorHolder = this.mPeerListener.getDatabaseDescriptorHolder(((Database.Database$GetDatabaseTableNamesRequest)this.mObjectMapper.convertValue((Object)jsonObject, (Class)Database.Database$GetDatabaseTableNamesRequest.class)).databaseId);
        try {
            final GetDatabaseTableNamesResponse getDatabaseTableNamesResponse = new GetDatabaseTableNamesResponse(null);
            getDatabaseTableNamesResponse.tableNames = databaseDescriptorHolder.driver.getTableNames((Object)databaseDescriptorHolder.descriptor);
            return (JsonRpcResult)getDatabaseTableNamesResponse;
        }
        catch (final SQLiteException ex) {
            throw new JsonRpcException(new JsonRpcError(JsonRpcError$ErrorCode.INVALID_REQUEST, ex.toString(), (JSONObject)null));
        }
    }
    
    @Deprecated
    public abstract static class DatabaseDriver extends BaseDatabaseDriver<String>
    {
        public DatabaseDriver(final Context context) {
            super(context);
        }
    }
    
    public static class ExecuteSQLResponse implements JsonRpcResult
    {
        @JsonProperty
        public List<String> columnNames;
        @JsonProperty
        public Database$Error sqlError;
        @JsonProperty
        public List<String> values;
    }
    
    public static class GetDatabaseTableNamesResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public List<String> tableNames;
        
        private GetDatabaseTableNamesResponse() {
        }
        
        public GetDatabaseTableNamesResponse(final Database$1 database$1) {
            this();
        }
    }
}
