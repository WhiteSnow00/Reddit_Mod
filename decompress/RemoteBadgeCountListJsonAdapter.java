// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.adapter;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b" }, d2 = { "Lcom/reddit/data/adapter/RemoteBadgeCountListJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/adapter/RemoteBadgeCountList;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/reddit/data/adapter/RemoteBadgeCountItem;", "listOfRemoteBadgeCountItemAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public final class RemoteBadgeCountListJsonAdapter extends JsonAdapter<RemoteBadgeCountList>
{
    private volatile Constructor<RemoteBadgeCountList> constructorRef;
    private final JsonAdapter<List<RemoteBadgeCountItem>> listOfRemoteBadgeCountItemAdapter;
    private final JsonReader$b options;
    
    public RemoteBadgeCountListJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "children" });
        this.listOfRemoteBadgeCountItemAdapter = (JsonAdapter<List<RemoteBadgeCountItem>>)y.c((Type)a0.d((Class)List.class, new Type[] { RemoteBadgeCountItem.class }), (Set)EmptySet.INSTANCE, "children");
    }
    
    public RemoteBadgeCountList fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Object o = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    continue;
                }
                o = this.listOfRemoteBadgeCountItemAdapter.fromJson(jsonReader);
                if (o == null) {
                    throw a.n("children", "children", jsonReader);
                }
                n &= 0xFFFFFFFE;
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (n == -2) {
            e.d(o, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.data.adapter.RemoteBadgeCountItem>");
            return new RemoteBadgeCountList((List)o);
        }
        Constructor<RemoteBadgeCountList> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            constructorRef = RemoteBadgeCountList.class.getDeclaredConstructor(List.class, Integer.TYPE, a.c);
            e.e((Object)(this.constructorRef = constructorRef), "RemoteBadgeCountList::cl\u2026his.constructorRef = it }");
        }
        final RemoteBadgeCountList instance = constructorRef.newInstance(o, n, null);
        e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final RemoteBadgeCountList list) {
        e.f((Object)x, "writer");
        if (list != null) {
            x.h();
            x.u("children");
            this.listOfRemoteBadgeCountItemAdapter.toJson(x, (Object)list.getChildren());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(RemoteBadgeCountList)";
    }
}
