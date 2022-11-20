// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2core;

import android.os.Parcelable$Creator;
import java.util.HashMap;
import android.os.Parcel;
import org.json.JSONObject;
import kotlin.TypeCastException;
import ng2.e;
import kotlin.collections.c;
import java.util.Map;
import kotlin.Metadata;
import java.io.Serializable;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\b\u0016\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00011B\u001b\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030$¢\u0006\u0004\b.\u0010/J\u0016\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0007J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\rJ\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0016\u001a\u00020\u0000H\u0016J\u0006\u0010\u0017\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\u000bJ\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010#\u001a\u00020\u0007H\u0016R&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030$8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001d\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030$8F¢\u0006\u0006\u001a\u0004\b,\u0010(¨\u00062" }, d2 = { "Lcom/tonyodev/fetch2core/Extras;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "key", "defaultValue", "getString", "", "getInt", "", "getLong", "", "getBoolean", "", "getDouble", "", "getFloat", "Lcom/tonyodev/fetch2core/MutableExtras;", "toMutableExtras", "toJSONString", "Lorg/json/JSONObject;", "toJSONObject", "copy", "isEmpty", "isNotEmpty", "toString", "Landroid/os/Parcel;", "dest", "flags", "Lcg2/j;", "writeToParcel", "describeContents", "", "other", "equals", "hashCode", "", "data", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "getSize", "()I", "size", "getMap", "map", "<init>", "(Ljava/util/Map;)V", "CREATOR", "a", "fetch2core_release" }, k = 1, mv = { 1, 4, 0 })
public class Extras implements Parcelable, Serializable
{
    public static final a CREATOR;
    public static final Extras f;
    private final Map<String, String> data;
    
    static {
        CREATOR = new a();
        f = new Extras(c.u4());
    }
    
    public Extras(final Map<String, String> data) {
        e.g((Object)data, "data");
        this.data = data;
    }
    
    public static final Extras access$getEmptyExtras$cp() {
        return Extras.f;
    }
    
    public static final Extras getEmptyExtras() {
        return Extras.f;
    }
    
    public Extras copy() {
        return new Extras(c.F4((Map)this.data));
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        final Class<? extends Extras> class1 = this.getClass();
        Class<?> class2;
        if (o != null) {
            class2 = o.getClass();
        }
        else {
            class2 = null;
        }
        if (e.a((Object)class1, (Object)class2) ^ true) {
            return false;
        }
        if (o != null) {
            return !(e.a((Object)this.data, (Object)((Extras)o).data) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2core.Extras");
    }
    
    public final boolean getBoolean(String s, boolean boolean1) {
        e.g((Object)s, "key");
        s = this.data.get(s);
        if (s != null) {
            boolean1 = Boolean.parseBoolean(s);
        }
        return boolean1;
    }
    
    public final Map<String, String> getData() {
        return this.data;
    }
    
    public final double getDouble(String s, double double1) {
        e.g((Object)s, "key");
        s = this.data.get(s);
        if (s != null) {
            double1 = Double.parseDouble(s);
        }
        return double1;
    }
    
    public final float getFloat(String s, float float1) {
        e.g((Object)s, "key");
        s = this.data.get(s);
        if (s != null) {
            float1 = Float.parseFloat(s);
        }
        return float1;
    }
    
    public final int getInt(String s, int int1) {
        e.g((Object)s, "key");
        s = this.data.get(s);
        if (s != null) {
            int1 = Integer.parseInt(s);
        }
        return int1;
    }
    
    public final long getLong(String s, long long1) {
        e.g((Object)s, "key");
        s = this.data.get(s);
        if (s != null) {
            long1 = Long.parseLong(s);
        }
        return long1;
    }
    
    public final Map<String, String> getMap() {
        return c.F4((Map)this.data);
    }
    
    public final int getSize() {
        return this.data.size();
    }
    
    public final String getString(String s, String s2) {
        e.g((Object)s, "key");
        e.g((Object)s2, "defaultValue");
        s = this.data.get(s);
        if (s != null) {
            s2 = s;
        }
        return s2;
    }
    
    @Override
    public int hashCode() {
        return this.data.hashCode();
    }
    
    public final boolean isEmpty() {
        return this.data.isEmpty();
    }
    
    public final boolean isNotEmpty() {
        return this.data.isEmpty() ^ true;
    }
    
    public final JSONObject toJSONObject() {
        JSONObject jsonObject;
        if (this.isEmpty()) {
            jsonObject = new JSONObject();
        }
        else {
            jsonObject = new JSONObject((Map)this.getMap());
        }
        return jsonObject;
    }
    
    public final String toJSONString() {
        String string;
        if (this.isEmpty()) {
            string = "{}";
        }
        else {
            string = new JSONObject((Map)this.getMap()).toString();
            e.b((Object)string, "JSONObject(map).toString()");
        }
        return string;
    }
    
    public final MutableExtras toMutableExtras() {
        return new MutableExtras((Map)c.H4((Map)this.data));
    }
    
    @Override
    public String toString() {
        return this.toJSONString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.g((Object)parcel, "dest");
        parcel.writeSerializable((Serializable)new HashMap<Object, Object>(this.data));
    }
    
    public static final class a implements Parcelable$Creator<Extras>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.g((Object)parcel, "source");
            final Serializable serializable = parcel.readSerializable();
            if (serializable != null) {
                return new Extras((Map<String, String>)serializable);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
        }
        
        public final Object[] newArray(final int n) {
            return new Extras[n];
        }
    }
}
