// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.mod;

import ah2.f;
import android.os.Parcel;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b/\u00100J\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003Jc\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0019H\u00d6\u0001J\u0019\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0019H\u00d6\u0001R\u001a\u0010\r\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b'\u0010&R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b(\u0010&R\u001a\u0010\u0010\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b)\u0010&R\u001a\u0010\u0011\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b*\u0010&R\u001a\u0010\u0012\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b+\u0010&R\u001a\u0010\u0013\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b,\u0010&R\u001a\u0010\u0014\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b-\u0010&R\u001a\u0010\u0015\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b.\u0010&¨\u00061" }, d2 = { "Lcom/reddit/domain/model/mod/ModPermissions;", "Lcom/reddit/domain/model/mod/IModPermissions;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "access", "config", "flair", "mail", "posts", "wiki", "chatConfig", "chatOperator", "all", "copy", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Z", "getAccess", "()Z", "getConfig", "getFlair", "getMail", "getPosts", "getWiki", "getChatConfig", "getChatOperator", "getAll", "<init>", "(ZZZZZZZZZ)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class ModPermissions implements IModPermissions, Parcelable
{
    public static final Parcelable$Creator<ModPermissions> CREATOR;
    private final boolean access;
    private final boolean all;
    private final boolean chatConfig;
    private final boolean chatOperator;
    private final boolean config;
    private final boolean flair;
    private final boolean mail;
    private final boolean posts;
    private final boolean wiki;
    
    static {
        CREATOR = (Parcelable$Creator)new ModPermissions$Creator();
    }
    
    public ModPermissions(@n(name = "access") final boolean access, @n(name = "config") final boolean config, @n(name = "flair") final boolean flair, @n(name = "mail") final boolean mail, @n(name = "posts") final boolean posts, @n(name = "wiki") final boolean wiki, @n(name = "chat_config") final boolean chatConfig, @n(name = "chat_operator") final boolean chatOperator, @n(name = "all") final boolean all) {
        this.access = access;
        this.config = config;
        this.flair = flair;
        this.mail = mail;
        this.posts = posts;
        this.wiki = wiki;
        this.chatConfig = chatConfig;
        this.chatOperator = chatOperator;
        this.all = all;
    }
    
    public final boolean component1() {
        return this.getAccess();
    }
    
    public final boolean component2() {
        return this.getConfig();
    }
    
    public final boolean component3() {
        return this.getFlair();
    }
    
    public final boolean component4() {
        return this.getMail();
    }
    
    public final boolean component5() {
        return this.getPosts();
    }
    
    public final boolean component6() {
        return this.getWiki();
    }
    
    public final boolean component7() {
        return this.getChatConfig();
    }
    
    public final boolean component8() {
        return this.getChatOperator();
    }
    
    public final boolean component9() {
        return this.getAll();
    }
    
    public final ModPermissions copy(@n(name = "access") final boolean b, @n(name = "config") final boolean b2, @n(name = "flair") final boolean b3, @n(name = "mail") final boolean b4, @n(name = "posts") final boolean b5, @n(name = "wiki") final boolean b6, @n(name = "chat_config") final boolean b7, @n(name = "chat_operator") final boolean b8, @n(name = "all") final boolean b9) {
        return new ModPermissions(b, b2, b3, b4, b5, b6, b7, b8, b9);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModPermissions)) {
            return false;
        }
        final ModPermissions modPermissions = (ModPermissions)o;
        return this.getAccess() == modPermissions.getAccess() && this.getConfig() == modPermissions.getConfig() && this.getFlair() == modPermissions.getFlair() && this.getMail() == modPermissions.getMail() && this.getPosts() == modPermissions.getPosts() && this.getWiki() == modPermissions.getWiki() && this.getChatConfig() == modPermissions.getChatConfig() && this.getChatOperator() == modPermissions.getChatOperator() && this.getAll() == modPermissions.getAll();
    }
    
    public boolean getAccess() {
        return this.access;
    }
    
    public boolean getAll() {
        return this.all;
    }
    
    public boolean getChatConfig() {
        return this.chatConfig;
    }
    
    public boolean getChatOperator() {
        return this.chatOperator;
    }
    
    public boolean getConfig() {
        return this.config;
    }
    
    public boolean getFlair() {
        return this.flair;
    }
    
    public boolean getMail() {
        return this.mail;
    }
    
    public boolean getPosts() {
        return this.posts;
    }
    
    public boolean getWiki() {
        return this.wiki;
    }
    
    @Override
    public int hashCode() {
        final int access = this.getAccess() ? 1 : 0;
        int n = 1;
        int n2 = access;
        if (access != 0) {
            n2 = 1;
        }
        int config;
        if ((config = (this.getConfig() ? 1 : 0)) != 0) {
            config = 1;
        }
        int flair;
        if ((flair = (this.getFlair() ? 1 : 0)) != 0) {
            flair = 1;
        }
        int mail;
        if ((mail = (this.getMail() ? 1 : 0)) != 0) {
            mail = 1;
        }
        int posts;
        if ((posts = (this.getPosts() ? 1 : 0)) != 0) {
            posts = 1;
        }
        int wiki;
        if ((wiki = (this.getWiki() ? 1 : 0)) != 0) {
            wiki = 1;
        }
        int chatConfig;
        if ((chatConfig = (this.getChatConfig() ? 1 : 0)) != 0) {
            chatConfig = 1;
        }
        int chatOperator;
        if ((chatOperator = (this.getChatOperator() ? 1 : 0)) != 0) {
            chatOperator = 1;
        }
        final int all = this.getAll() ? 1 : 0;
        if (all == 0) {
            n = all;
        }
        return (((((((n2 * 31 + config) * 31 + flair) * 31 + mail) * 31 + posts) * 31 + wiki) * 31 + chatConfig) * 31 + chatOperator) * 31 + n;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ModPermissions(access=");
        k.append(this.getAccess());
        k.append(", config=");
        k.append(this.getConfig());
        k.append(", flair=");
        k.append(this.getFlair());
        k.append(", mail=");
        k.append(this.getMail());
        k.append(", posts=");
        k.append(this.getPosts());
        k.append(", wiki=");
        k.append(this.getWiki());
        k.append(", chatConfig=");
        k.append(this.getChatConfig());
        k.append(", chatOperator=");
        k.append(this.getChatOperator());
        k.append(", all=");
        k.append(this.getAll());
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeInt((int)(this.access ? 1 : 0));
        parcel.writeInt((int)(this.config ? 1 : 0));
        parcel.writeInt((int)(this.flair ? 1 : 0));
        parcel.writeInt((int)(this.mail ? 1 : 0));
        parcel.writeInt((int)(this.posts ? 1 : 0));
        parcel.writeInt((int)(this.wiki ? 1 : 0));
        parcel.writeInt((int)(this.chatConfig ? 1 : 0));
        parcel.writeInt((int)(this.chatOperator ? 1 : 0));
        parcel.writeInt((int)(this.all ? 1 : 0));
    }
}
