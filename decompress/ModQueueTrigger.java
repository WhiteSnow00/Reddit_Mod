// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools;

import android.os.Parcel;
import al0.f0;
import sg2.e;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\nH\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/modtools/ModQueueTrigger;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/modtools/ModTriggerType;", "component1", "", "component2", "type", "message", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Lcom/reddit/domain/modtools/ModTriggerType;", "getType", "()Lcom/reddit/domain/modtools/ModTriggerType;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(Lcom/reddit/domain/modtools/ModTriggerType;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class ModQueueTrigger implements Parcelable
{
    public static final Parcelable$Creator<ModQueueTrigger> CREATOR;
    private final String message;
    private final ModTriggerType type;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public ModQueueTrigger(final ModTriggerType type, final String message) {
        e.f((Object)type, "type");
        this.type = type;
        this.message = message;
    }
    
    public final ModTriggerType component1() {
        return this.type;
    }
    
    public final String component2() {
        return this.message;
    }
    
    public final ModQueueTrigger copy(final ModTriggerType modTriggerType, final String s) {
        e.f((Object)modTriggerType, "type");
        return new ModQueueTrigger(modTriggerType, s);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModQueueTrigger)) {
            return false;
        }
        final ModQueueTrigger modQueueTrigger = (ModQueueTrigger)o;
        return this.type == modQueueTrigger.type && e.a((Object)this.message, (Object)modQueueTrigger.message);
    }
    
    public final String getMessage() {
        return this.message;
    }
    
    public final ModTriggerType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.type.hashCode();
        final String message = this.message;
        int hashCode2;
        if (message == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = message.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("ModQueueTrigger(type=");
        r.append(this.type);
        r.append(", message=");
        return f0.n(r, this.message, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.type.name());
        parcel.writeString(this.message);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<ModQueueTrigger>
    {
        public final ModQueueTrigger createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new ModQueueTrigger(ModTriggerType.valueOf(parcel.readString()), parcel.readString());
        }
        
        public final ModQueueTrigger[] newArray(final int n) {
            return new ModQueueTrigger[n];
        }
    }
}
