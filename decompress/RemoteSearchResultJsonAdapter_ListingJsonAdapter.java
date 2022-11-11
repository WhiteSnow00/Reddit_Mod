// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.adapter;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018" }, d2 = { "Lcom/reddit/data/adapter/RemoteSearchResultJsonAdapter_ListingJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/adapter/RemoteSearchResultJsonAdapter$Listing;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/adapter/RemoteSearchResultJsonAdapter$Data;", "dataAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public final class RemoteSearchResultJsonAdapter_ListingJsonAdapter extends JsonAdapter<RemoteSearchResultJsonAdapter$Listing>
{
    private final JsonAdapter<RemoteSearchResultJsonAdapter$Data> dataAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public RemoteSearchResultJsonAdapter_ListingJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "kind", "data" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "kind");
        this.dataAdapter = (JsonAdapter<RemoteSearchResultJsonAdapter$Data>)y.c((Type)RemoteSearchResultJsonAdapter$Data.class, (Set)instance, "data");
    }
    
    public RemoteSearchResultJsonAdapter$Listing fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        RemoteSearchResultJsonAdapter$Data remoteSearchResultJsonAdapter$Data = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    }
                    remoteSearchResultJsonAdapter$Data = (RemoteSearchResultJsonAdapter$Data)this.dataAdapter.fromJson(jsonReader);
                    if (remoteSearchResultJsonAdapter$Data != null) {
                        continue;
                    }
                    throw a.n("data_", "data", jsonReader);
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("kind", "kind", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("kind", "kind", jsonReader);
        }
        if (remoteSearchResultJsonAdapter$Data != null) {
            return new RemoteSearchResultJsonAdapter$Listing(s, remoteSearchResultJsonAdapter$Data);
        }
        throw a.h("data_", "data", jsonReader);
    }
    
    public void toJson(final x x, final RemoteSearchResultJsonAdapter$Listing remoteSearchResultJsonAdapter$Listing) {
        e.f((Object)x, "writer");
        if (remoteSearchResultJsonAdapter$Listing != null) {
            x.h();
            x.u("kind");
            this.stringAdapter.toJson(x, (Object)remoteSearchResultJsonAdapter$Listing.getKind());
            x.u("data");
            this.dataAdapter.toJson(x, (Object)remoteSearchResultJsonAdapter$Listing.getData());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(RemoteSearchResultJsonAdapter.Listing)";
    }
}
