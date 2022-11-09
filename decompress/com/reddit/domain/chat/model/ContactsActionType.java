// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import android.os.Parcel;
import ah2.f;
import android.os.Parcelable$Creator;
import com.squareup.moshi.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/chat/model/ContactsActionType;", "Landroid/os/Parcelable;", "()V", "ADD", "CREATE", "Lcom/reddit/domain/chat/model/ContactsActionType$ADD;", "Lcom/reddit/domain/chat/model/ContactsActionType$CREATE;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class ContactsActionType implements Parcelable
{
    private ContactsActionType() {
    }
    
    @o(generateAdapter = true)
    @Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0007\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/chat/model/ContactsActionType$ADD;", "Lcom/reddit/domain/chat/model/ContactsActionType;", "Landroid/os/Parcelable;", "", "component1", "channelUrl", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getChannelUrl", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class ADD extends ContactsActionType
    {
        public static final Parcelable$Creator<ADD> CREATOR;
        private final String channelUrl;
        
        static {
            CREATOR = (Parcelable$Creator)new Creator();
        }
        
        public ADD(final String channelUrl) {
            f.f((Object)channelUrl, "channelUrl");
            super(null);
            this.channelUrl = channelUrl;
        }
        
        public final String component1() {
            return this.channelUrl;
        }
        
        public final ADD copy(final String s) {
            f.f((Object)s, "channelUrl");
            return new ADD(s);
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof ADD && f.a((Object)this.channelUrl, (Object)((ADD)o).channelUrl));
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
            return b.k(a.k("ADD(channelUrl="), this.channelUrl, ')');
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            f.f((Object)parcel, "out");
            parcel.writeString(this.channelUrl);
        }
        
        @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
        public static final class Creator implements Parcelable$Creator<ADD>
        {
            public final ADD createFromParcel(final Parcel parcel) {
                f.f((Object)parcel, "parcel");
                return new ADD(parcel.readString());
            }
            
            public final ADD[] newArray(final int n) {
                return new ADD[n];
            }
        }
    }
    
    @o(generateAdapter = true)
    @Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u00d6\u0001R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/chat/model/ContactsActionType$CREATE;", "Lcom/reddit/domain/chat/model/ContactsActionType;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/chat/model/ContactData;", "component1", "defaultSelectedContact", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Lcom/reddit/domain/chat/model/ContactData;", "getDefaultSelectedContact", "()Lcom/reddit/domain/chat/model/ContactData;", "<init>", "(Lcom/reddit/domain/chat/model/ContactData;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class CREATE extends ContactsActionType
    {
        public static final Parcelable$Creator<CREATE> CREATOR;
        private final ContactData defaultSelectedContact;
        
        static {
            CREATOR = (Parcelable$Creator)new Creator();
        }
        
        public CREATE() {
            this(null, 1, null);
        }
        
        public CREATE(final ContactData defaultSelectedContact) {
            super(null);
            this.defaultSelectedContact = defaultSelectedContact;
        }
        
        public final ContactData component1() {
            return this.defaultSelectedContact;
        }
        
        public final CREATE copy(final ContactData contactData) {
            return new CREATE(contactData);
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof CREATE && f.a((Object)this.defaultSelectedContact, (Object)((CREATE)o).defaultSelectedContact));
        }
        
        public final ContactData getDefaultSelectedContact() {
            return this.defaultSelectedContact;
        }
        
        @Override
        public int hashCode() {
            final ContactData defaultSelectedContact = this.defaultSelectedContact;
            int hashCode;
            if (defaultSelectedContact == null) {
                hashCode = 0;
            }
            else {
                hashCode = defaultSelectedContact.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("CREATE(defaultSelectedContact=");
            k.append(this.defaultSelectedContact);
            k.append(')');
            return k.toString();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            f.f((Object)parcel, "out");
            final ContactData defaultSelectedContact = this.defaultSelectedContact;
            if (defaultSelectedContact == null) {
                parcel.writeInt(0);
            }
            else {
                parcel.writeInt(1);
                defaultSelectedContact.writeToParcel(parcel, n);
            }
        }
        
        @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
        public static final class Creator implements Parcelable$Creator<CREATE>
        {
            public final CREATE createFromParcel(final Parcel parcel) {
                f.f((Object)parcel, "parcel");
                Object fromParcel;
                if (parcel.readInt() == 0) {
                    fromParcel = null;
                }
                else {
                    fromParcel = ContactData.CREATOR.createFromParcel(parcel);
                }
                return new CREATE((ContactData)fromParcel);
            }
            
            public final CREATE[] newArray(final int n) {
                return new CREATE[n];
            }
        }
    }
}
