// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.data;

import androidx.viewpager.widget.c;
import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012" }, d2 = { "Lcom/reddit/discoveryunits/data/OrderByJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/discoveryunits/data/OrderBy;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/discoveryunits/data/OrderType;", "orderTypeAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class OrderByJsonAdapter extends JsonAdapter<OrderBy>
{
    private volatile Constructor<OrderBy> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<OrderType> orderTypeAdapter;
    
    public OrderByJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "start", "distance", "index", "orderType" });
        final Class<Integer> type = Integer.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)type, (Set)instance, "start");
        this.orderTypeAdapter = (JsonAdapter<OrderType>)y.c((Type)OrderType.class, (Set)instance, "orderType");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Integer value = 0;
        jsonReader.h();
        Integer n2;
        Integer n = n2 = value;
        int n3 = -1;
        OrderType orderType = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                continue;
                            }
                            orderType = (OrderType)this.orderTypeAdapter.fromJson(jsonReader);
                            if (orderType != null) {
                                continue;
                            }
                            throw a.n("orderType", "orderType", jsonReader);
                        }
                        else {
                            n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                            if (n2 == null) {
                                throw a.n("index", "index", jsonReader);
                            }
                            n3 &= 0xFFFFFFFB;
                        }
                    }
                    else {
                        n = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n == null) {
                            throw a.n("distance", "distance", jsonReader);
                        }
                        n3 &= 0xFFFFFFFD;
                    }
                }
                else {
                    value = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (value == null) {
                        throw a.n("start", "start", jsonReader);
                    }
                    n3 &= 0xFFFFFFFE;
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        OrderBy orderBy;
        if (n3 == -8) {
            final int intValue = value;
            final int intValue2 = n;
            final int intValue3 = n2;
            if (orderType == null) {
                throw a.h("orderType", "orderType", jsonReader);
            }
            orderBy = new OrderBy(intValue, intValue2, intValue3, orderType);
        }
        else {
            Constructor<OrderBy> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                final Class<Integer> type = Integer.TYPE;
                constructorRef = OrderBy.class.getDeclaredConstructor(type, type, type, OrderType.class, type, a.c);
                f.e((Object)(this.constructorRef = constructorRef), "OrderBy::class.java.getD\u2026his.constructorRef = it }");
            }
            if (orderType == null) {
                throw a.h("orderType", "orderType", jsonReader);
            }
            final OrderBy instance = constructorRef.newInstance(value, n, n2, orderType, n3, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            orderBy = instance;
        }
        return orderBy;
    }
    
    public final void toJson(final x x, final Object o) {
        final OrderBy orderBy = (OrderBy)o;
        f.f((Object)x, "writer");
        if (orderBy != null) {
            x.h();
            x.w("start");
            c.n(orderBy.f, this.intAdapter, x, "distance");
            c.n(orderBy.g, this.intAdapter, x, "index");
            c.n(orderBy.h, this.intAdapter, x, "orderType");
            this.orderTypeAdapter.toJson(x, (Object)orderBy.i);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(OrderBy)";
    }
}
