// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.pnsettings.model;

import java.util.ArrayList;
import java.util.Iterator;
import a2.b;
import android.os.Parcel;
import ak0.m;
import ah2.f;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J/\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\t\u0010\f\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0013\u001a\u00020\rH\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rH\u00d6\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\"" }, d2 = { "Lcom/reddit/domain/modtools/pnsettings/model/Section;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "Lcom/reddit/domain/modtools/pnsettings/model/Row;", "component3", "id", "title", "rows", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getRows", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class Section implements Parcelable
{
    public static final Parcelable$Creator<Section> CREATOR;
    private final String id;
    private final List<Row> rows;
    private final String title;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Section(final String id, final String title, final List<? extends Row> rows) {
        f.f((Object)id, "id");
        f.f((Object)rows, "rows");
        this.id = id;
        this.title = title;
        this.rows = (List<Row>)rows;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.title;
    }
    
    public final List<Row> component3() {
        return this.rows;
    }
    
    public final Section copy(final String s, final String s2, final List<? extends Row> list) {
        f.f((Object)s, "id");
        f.f((Object)list, "rows");
        return new Section(s, s2, list);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Section)) {
            return false;
        }
        final Section section = (Section)o;
        return f.a((Object)this.id, (Object)section.id) && f.a((Object)this.title, (Object)section.title) && f.a((Object)this.rows, (Object)section.rows);
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final List<Row> getRows() {
        return this.rows;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String title = this.title;
        int hashCode2;
        if (title == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = title.hashCode();
        }
        return this.rows.hashCode() + (hashCode * 31 + hashCode2) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Section(id=");
        k.append(this.id);
        k.append(", title=");
        k.append(this.title);
        k.append(", rows=");
        return m.n(k, (List)this.rows, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        final Iterator n2 = b.n((List)this.rows, parcel);
        while (n2.hasNext()) {
            parcel.writeParcelable((Parcelable)n2.next(), n);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<Section>
    {
        public final Section createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = d.e((Class)Section.class, parcel, list, i, 1)) {}
            return new Section(string, string2, (List<? extends Row>)list);
        }
        
        public final Section[] newArray(final int n) {
            return new Section[n];
        }
    }
}
