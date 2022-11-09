// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/streaming/MeterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/streaming/Meter;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "floatAdapter", "", "intAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class MeterJsonAdapter extends JsonAdapter<Meter>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Float> floatAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader$b options;
    
    public MeterJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "enabled", "proportion_full", "full_meter_duration" });
        final Class<Boolean> type = Boolean.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)type, (Set)instance, "enabled");
        this.floatAdapter = (JsonAdapter<Float>)y.c((Type)Float.TYPE, (Set)instance, "proportionFull");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "fullMeterDurationSeconds");
    }
    
    public Meter fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Integer n2;
        Number n = n2 = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            continue;
                        }
                        n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n2 != null) {
                            continue;
                        }
                        throw a.n("fullMeterDurationSeconds", "full_meter_duration", jsonReader);
                    }
                    else {
                        n = (Float)this.floatAdapter.fromJson(jsonReader);
                        if (n != null) {
                            continue;
                        }
                        throw a.n("proportionFull", "proportion_full", jsonReader);
                    }
                }
                else {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("enabled", "enabled", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (b == null) {
            throw a.h("enabled", "enabled", jsonReader);
        }
        final boolean booleanValue = b;
        if (n == null) {
            throw a.h("proportionFull", "proportion_full", jsonReader);
        }
        final float floatValue = (float)n;
        if (n2 != null) {
            return new Meter(booleanValue, floatValue, n2);
        }
        throw a.h("fullMeterDurationSeconds", "full_meter_duration", jsonReader);
    }
    
    public void toJson(final x x, final Meter meter) {
        f.f((Object)x, "writer");
        if (meter != null) {
            x.h();
            x.w("enabled");
            this.booleanAdapter.toJson(x, (Object)meter.getEnabled());
            x.w("proportion_full");
            this.floatAdapter.toJson(x, (Object)meter.getProportionFull());
            x.w("full_meter_duration");
            this.intAdapter.toJson(x, (Object)meter.getFullMeterDurationSeconds());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Meter)";
    }
}
