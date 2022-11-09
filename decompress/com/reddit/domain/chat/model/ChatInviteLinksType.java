// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/chat/model/ChatInviteLinksType;", "Landroid/os/Parcelable;", "()V", "Direct", "Group", "Lcom/reddit/domain/chat/model/ChatInviteLinksType$Direct;", "Lcom/reddit/domain/chat/model/ChatInviteLinksType$Group;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class ChatInviteLinksType implements Parcelable
{
    private ChatInviteLinksType() {
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002H\u00d6\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u00d6\u0001¨\u0006\u000b" }, d2 = { "Lcom/reddit/domain/chat/model/ChatInviteLinksType$Direct;", "Lcom/reddit/domain/chat/model/ChatInviteLinksType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "<init>", "()V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Direct extends ChatInviteLinksType
    {
        public static final Parcelable$Creator<Direct> CREATOR;
        public static final Direct INSTANCE;
        
        static {
            INSTANCE = new Direct();
            CREATOR = (Parcelable$Creator)new Creator();
        }
        
        private Direct() {
            super(null);
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            f.f((Object)parcel, "out");
            parcel.writeInt(1);
        }
        
        @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
        public static final class Creator implements Parcelable$Creator<Direct>
        {
            public final Direct createFromParcel(final Parcel parcel) {
                f.f((Object)parcel, "parcel");
                parcel.readInt();
                return Direct.INSTANCE;
            }
            
            public final Direct[] newArray(final int n) {
                return new Direct[n];
            }
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0006\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/chat/model/ChatInviteLinksType$Group;", "Lcom/reddit/domain/chat/model/ChatInviteLinksType;", "", "component1", "channelUrl", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getChannelUrl", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Group extends ChatInviteLinksType
    {
        public static final Parcelable$Creator<Group> CREATOR;
        private final String channelUrl;
        
        static {
            CREATOR = (Parcelable$Creator)new Creator();
        }
        
        public Group(final String channelUrl) {
            f.f((Object)channelUrl, "channelUrl");
            super(null);
            this.channelUrl = channelUrl;
        }
        
        public final String component1() {
            return this.channelUrl;
        }
        
        public final Group copy(final String s) {
            f.f((Object)s, "channelUrl");
            return new Group(s);
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof Group && f.a((Object)this.channelUrl, (Object)((Group)o).channelUrl));
        }
        
        public final String getChannelUrl() {
            return this.channelUrl;
        }
        
        @Override
        public int hashCode() {
            return this.channelUrl.hashCode();
        }
        
        @Override
        public String toString() {
            return b.k(a.k("Group(channelUrl="), this.channelUrl, ')');
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            f.f((Object)parcel, "out");
            parcel.writeString(this.channelUrl);
        }
        
        @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
        public static final class Creator implements Parcelable$Creator<Group>
        {
            public final Group createFromParcel(final Parcel parcel) {
                f.f((Object)parcel, "parcel");
                return new Group(parcel.readString());
            }
            
            public final Group[] newArray(final int n) {
                return new Group[n];
            }
        }
    }
}
