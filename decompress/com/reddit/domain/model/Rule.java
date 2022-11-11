// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import sg2.e;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\nH\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/Rule;", "Landroid/os/Parcelable;", "", "component1", "Lcom/reddit/domain/model/Content;", "component2", "name", "content", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/reddit/domain/model/Content;", "getContent", "()Lcom/reddit/domain/model/Content;", "<init>", "(Ljava/lang/String;Lcom/reddit/domain/model/Content;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Rule implements Parcelable
{
    public static final Parcelable$Creator<Rule> CREATOR;
    private final Content content;
    private final String name;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Rule(@n(name = "name") String name, @n(name = "content") final Content content) {
        e.f((Object)name, "name");
        e.f((Object)content, "content");
        this.name = name;
        this.content = content;
    }
    
    public final String component1() {
        return this.name;
    }
    
    public final Content component2() {
        return this.content;
    }
    
    public final Rule copy(@n(name = "name") final String s, @n(name = "content") final Content content) {
        e.f((Object)s, "name");
        e.f((Object)content, "content");
        return new Rule(s, content);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Rule)) {
            return false;
        }
        final Rule rule = (Rule)o;
        return e.a((Object)this.name, (Object)rule.name) && e.a((Object)this.content, (Object)rule.content);
    }
    
    public final Content getContent() {
        return this.content;
    }
    
    public final String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        return this.content.hashCode() + this.name.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Rule(name=");
        r.append(this.name);
        r.append(", content=");
        r.append(this.content);
        r.append(')');
        return r.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.name);
        this.content.writeToParcel(parcel, n);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<Rule>
    {
        public final Rule createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new Rule(parcel.readString(), (Content)Content.CREATOR.createFromParcel(parcel));
        }
        
        public final Rule[] newArray(final int n) {
            return new Rule[n];
        }
    }
}
