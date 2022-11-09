// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import androidx.appcompat.widget.s0;
import ah2.f;
import com.squareup.moshi.n;
import java.util.Map;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Bi\b\u0000\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011Jo\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000e\u001a\u00020\bH\u00c6\u0001¨\u0006\u0012" }, d2 = { "Lcom/reddit/data/snoovatar/entity/SaveSnoovatarBodyJson;", "", "", "", "accessoryIds", "", "Lcom/reddit/data/snoovatar/entity/SnoovatarStyleJson;", "styles", "", "setToProfile", "share", "downloadAvatar", "source", "sourceAuthorId", "skipTelemetry", "copy", "<init>", "(Ljava/util/List;Ljava/util/Map;ZZZLjava/lang/String;Ljava/lang/String;Z)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class SaveSnoovatarBodyJson
{
    public final List<String> a;
    public final Map<String, SnoovatarStyleJson> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;
    
    public SaveSnoovatarBodyJson(@n(name = "accessory_ids") final List<String> a, final Map<String, SnoovatarStyleJson> b, @n(name = "set_avatar_to_profile") final boolean c, final boolean d, @n(name = "download_avatar") final boolean e, final String f, @n(name = "source_author_id") final String g, @n(name = "skip_telemetry") final boolean h) {
        ah2.f.f((Object)a, "accessoryIds");
        ah2.f.f((Object)b, "styles");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final SaveSnoovatarBodyJson copy(@n(name = "accessory_ids") final List<String> list, final Map<String, SnoovatarStyleJson> map, @n(name = "set_avatar_to_profile") final boolean b, final boolean b2, @n(name = "download_avatar") final boolean b3, final String s, @n(name = "source_author_id") final String s2, @n(name = "skip_telemetry") final boolean b4) {
        ah2.f.f((Object)list, "accessoryIds");
        ah2.f.f((Object)map, "styles");
        return new SaveSnoovatarBodyJson(list, map, b, b2, b3, s, s2, b4);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SaveSnoovatarBodyJson)) {
            return false;
        }
        final SaveSnoovatarBodyJson saveSnoovatarBodyJson = (SaveSnoovatarBodyJson)o;
        return ah2.f.a((Object)this.a, (Object)saveSnoovatarBodyJson.a) && ah2.f.a((Object)this.b, (Object)saveSnoovatarBodyJson.b) && this.c == saveSnoovatarBodyJson.c && this.d == saveSnoovatarBodyJson.d && this.e == saveSnoovatarBodyJson.e && ah2.f.a((Object)this.f, (Object)saveSnoovatarBodyJson.f) && ah2.f.a((Object)this.g, (Object)saveSnoovatarBodyJson.g) && this.h == saveSnoovatarBodyJson.h;
    }
    
    @Override
    public final int hashCode() {
        final int g = ak0.n.g((Map)this.b, this.a.hashCode() * 31, 31);
        final int c = this.c ? 1 : 0;
        int n = 1;
        int n2 = c;
        if (c != 0) {
            n2 = 1;
        }
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        final String f = this.f;
        int hashCode = 0;
        int hashCode2;
        if (f == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = f.hashCode();
        }
        final String g2 = this.g;
        if (g2 != null) {
            hashCode = g2.hashCode();
        }
        final int h = this.h ? 1 : 0;
        if (h == 0) {
            n = h;
        }
        return (((((g + n2) * 31 + d) * 31 + e) * 31 + hashCode2) * 31 + hashCode) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SaveSnoovatarBodyJson(accessoryIds=");
        k.append(this.a);
        k.append(", styles=");
        k.append(this.b);
        k.append(", setToProfile=");
        k.append(this.c);
        k.append(", share=");
        k.append(this.d);
        k.append(", downloadAvatar=");
        k.append(this.e);
        k.append(", source=");
        k.append(this.f);
        k.append(", sourceAuthorId=");
        k.append(this.g);
        k.append(", skipTelemetry=");
        return s0.o(k, this.h, ')');
    }
}
