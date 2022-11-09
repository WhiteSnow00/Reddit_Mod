// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.protocol.module;

import java.util.List;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import android.content.SharedPreferences;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.console.CLog;
import java.util.Locale;
import org.json.JSONException;
import java.util.Iterator;
import java.util.Map;
import com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper;
import java.util.ArrayList;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.util.Set;
import android.content.SharedPreferences$Editor;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.inspector.domstorage.DOMStoragePeerManager;
import android.content.Context;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class DOMStorage implements ChromeDevtoolsDomain
{
    private final Context mContext;
    private final DOMStoragePeerManager mDOMStoragePeerManager;
    private final ObjectMapper mObjectMapper;
    
    public DOMStorage(final Context mContext) {
        this.mObjectMapper = new ObjectMapper();
        this.mContext = mContext;
        this.mDOMStoragePeerManager = new DOMStoragePeerManager(mContext);
    }
    
    private static void assignByType(final SharedPreferences$Editor sharedPreferences$Editor, final String s, final Object o) throws IllegalArgumentException {
        if (o instanceof Integer) {
            sharedPreferences$Editor.putInt(s, (int)o);
        }
        else if (o instanceof Long) {
            sharedPreferences$Editor.putLong(s, (long)o);
        }
        else if (o instanceof Float) {
            sharedPreferences$Editor.putFloat(s, (float)o);
        }
        else if (o instanceof Boolean) {
            sharedPreferences$Editor.putBoolean(s, (boolean)o);
        }
        else if (o instanceof String) {
            sharedPreferences$Editor.putString(s, (String)o);
        }
        else {
            if (!(o instanceof Set)) {
                final StringBuilder k = a.k("Unsupported type=");
                k.append(o.getClass().getName());
                throw new IllegalArgumentException(k.toString());
            }
            sharedPreferences$Editor.putStringSet(s, (Set)o);
        }
    }
    
    @ChromeDevtoolsMethod
    public void disable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        this.mDOMStoragePeerManager.removePeer(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public void enable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        this.mDOMStoragePeerManager.addPeer(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult getDOMStorageItems(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws JSONException {
        final StorageId storageId = this.mObjectMapper.convertValue(jsonObject.getJSONObject("storageId"), StorageId.class);
        final ArrayList entries = new ArrayList();
        final String securityOrigin = storageId.securityOrigin;
        if (storageId.isLocalStorage) {
            for (final Map.Entry<K, Object> entry : SharedPreferencesHelper.getSharedPreferenceEntriesSorted(this.mContext.getSharedPreferences(securityOrigin, 0))) {
                final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<String>(2);
                list.add(entry.getKey());
                list.add(SharedPreferencesHelper.valueToString(entry.getValue()));
                entries.add(list);
            }
        }
        final GetDOMStorageItemsResult getDOMStorageItemsResult = new GetDOMStorageItemsResult(null);
        getDOMStorageItemsResult.entries = entries;
        return getDOMStorageItemsResult;
    }
    
    @ChromeDevtoolsMethod
    public void removeDOMStorageItem(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws JSONException {
        final StorageId storageId = this.mObjectMapper.convertValue(jsonObject.getJSONObject("storageId"), StorageId.class);
        final String string = jsonObject.getString("key");
        if (storageId.isLocalStorage) {
            this.mContext.getSharedPreferences(storageId.securityOrigin, 0).edit().remove(string).apply();
        }
    }
    
    @ChromeDevtoolsMethod
    public void setDOMStorageItem(JsonRpcPeer string, JSONObject string2) throws JSONException, JsonRpcException {
        final StorageId storageId = this.mObjectMapper.convertValue(string2.getJSONObject("storageId"), StorageId.class);
        string = (JsonRpcPeer)string2.getString("key");
        string2 = (JSONObject)string2.getString("value");
        if (storageId.isLocalStorage) {
            final SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(storageId.securityOrigin, 0);
            final Object value = sharedPreferences.getAll().get(string);
            Label_0158: {
                if (value == null) {
                    break Label_0158;
                }
                try {
                    final SharedPreferences$Editor edit = sharedPreferences.edit();
                    try {
                        assignByType(edit, (String)string, SharedPreferencesHelper.valueFromString((String)string2, value));
                        edit.apply();
                    }
                    catch (final IllegalArgumentException ex) {
                        throw new DOMStorageAssignmentException(String.format(Locale.US, "Type mismatch setting %s to %s (expected %s)", string, string2, value.getClass().getSimpleName()));
                    }
                }
                catch (final DOMStorageAssignmentException ex2) {
                    CLog.writeToConsole(this.mDOMStoragePeerManager, Console.MessageLevel.ERROR, Console.MessageSource.STORAGE, ex2.getMessage());
                    if (sharedPreferences.contains((String)string)) {
                        this.mDOMStoragePeerManager.signalItemUpdated(storageId, (String)string, (String)string2, SharedPreferencesHelper.valueToString(value));
                        return;
                    }
                    this.mDOMStoragePeerManager.signalItemRemoved(storageId, (String)string);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported: cannot add new key ");
                    sb.append((String)string);
                    sb.append(" due to lack of type inference");
                    throw new DOMStorageAssignmentException(sb.toString());
                }
            }
        }
    }
    
    public static class DOMStorageAssignmentException extends Exception
    {
        public DOMStorageAssignmentException(final String s) {
            super(s);
        }
    }
    
    public static class DomStorageItemAddedParams
    {
        @JsonProperty(required = true)
        public String key;
        @JsonProperty(required = true)
        public String newValue;
        @JsonProperty(required = true)
        public StorageId storageId;
    }
    
    public static class DomStorageItemRemovedParams
    {
        @JsonProperty(required = true)
        public String key;
        @JsonProperty(required = true)
        public StorageId storageId;
    }
    
    public static class DomStorageItemUpdatedParams
    {
        @JsonProperty(required = true)
        public String key;
        @JsonProperty(required = true)
        public String newValue;
        @JsonProperty(required = true)
        public String oldValue;
        @JsonProperty(required = true)
        public StorageId storageId;
    }
    
    public static class DomStorageItemsClearedParams
    {
        @JsonProperty(required = true)
        public StorageId storageId;
    }
    
    public static class GetDOMStorageItemsResult implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public List<List<String>> entries;
        
        private GetDOMStorageItemsResult() {
        }
    }
    
    public static class StorageId
    {
        @JsonProperty(required = true)
        public boolean isLocalStorage;
        @JsonProperty(required = true)
        public String securityOrigin;
    }
}
