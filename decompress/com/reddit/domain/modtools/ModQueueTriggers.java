// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools;

import al0.f0;
import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import sg2.e;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u00d6\u0001R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/modtools/ModQueueTriggers;", "Landroid/os/Parcelable;", "", "Lcom/reddit/domain/modtools/ModQueueTrigger;", "component1", "triggers", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/util/List;", "getTriggers", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class ModQueueTriggers implements Parcelable
{
    public static final Parcelable$Creator<ModQueueTriggers> CREATOR;
    private final List<ModQueueTrigger> triggers;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public ModQueueTriggers(final List<ModQueueTrigger> triggers) {
        e.f((Object)triggers, "triggers");
        this.triggers = triggers;
    }
    
    public final List<ModQueueTrigger> component1() {
        return this.triggers;
    }
    
    public final ModQueueTriggers copy(final List<ModQueueTrigger> list) {
        e.f((Object)list, "triggers");
        return new ModQueueTriggers(list);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ModQueueTriggers && e.a((Object)this.triggers, (Object)((ModQueueTriggers)o).triggers));
    }
    
    public final List<ModQueueTrigger> getTriggers() {
        return this.triggers;
    }
    
    @Override
    public int hashCode() {
        return this.triggers.hashCode();
    }
    
    @Override
    public String toString() {
        return d.o(a.r("ModQueueTriggers(triggers="), (List)this.triggers, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        final Iterator s = al0.a.s((List)this.triggers, parcel);
        while (s.hasNext()) {
            ((ModQueueTrigger)s.next()).writeToParcel(parcel, n);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<ModQueueTriggers>
    {
        public final ModQueueTriggers createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = f0.b((Parcelable$Creator)ModQueueTrigger.CREATOR, parcel, list, i, 1)) {}
            return new ModQueueTriggers((List<ModQueueTrigger>)list);
        }
        
        public final ModQueueTriggers[] newArray(final int n) {
            return new ModQueueTriggers[n];
        }
    }
}
