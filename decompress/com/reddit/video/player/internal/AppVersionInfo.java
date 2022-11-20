// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014" }, d2 = { "Lcom/reddit/video/player/internal/AppVersionInfo;", "", "name", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AppVersionInfo
{
    public static final Companion Companion;
    private final int code;
    private final String name;
    
    static {
        Companion = new Companion(null);
    }
    
    public AppVersionInfo(final String name, final int code) {
        e.f((Object)name, "name");
        this.name = name;
        this.code = code;
    }
    
    public static AppVersionInfo copy$default(final AppVersionInfo appVersionInfo, String name, int code, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            name = appVersionInfo.name;
        }
        if ((n & 0x2) != 0x0) {
            code = appVersionInfo.code;
        }
        return appVersionInfo.copy(name, code);
    }
    
    public final String component1() {
        return this.name;
    }
    
    public final int component2() {
        return this.code;
    }
    
    public final AppVersionInfo copy(final String s, final int n) {
        e.f((Object)s, "name");
        return new AppVersionInfo(s, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppVersionInfo)) {
            return false;
        }
        final AppVersionInfo appVersionInfo = (AppVersionInfo)o;
        return e.a((Object)this.name, (Object)appVersionInfo.name) && this.code == appVersionInfo.code;
    }
    
    public final int getCode() {
        return this.code;
    }
    
    public final String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.code) + this.name.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("AppVersionInfo(name=");
        t.append(this.name);
        t.append(", code=");
        return d.j(t, this.code, ')');
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/video/player/internal/AppVersionInfo$Companion;", "", "()V", "from", "Lcom/reddit/video/player/internal/AppVersionInfo;", "context", "Landroid/content/Context;", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final AppVersionInfo from(final Context context) {
            e.f((Object)context, "context");
            final PackageManager packageManager = context.getPackageManager();
            final String packageName = context.getPackageName();
            AppVersionInfo appVersionInfo;
            try {
                final PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                final String versionName = packageInfo.versionName;
                e.e((Object)versionName, "packageInfo.versionName");
                appVersionInfo = new AppVersionInfo(versionName, packageInfo.versionCode);
            }
            catch (final PackageManager$NameNotFoundException ex) {
                appVersionInfo = new AppVersionInfo("unknown", 0);
            }
            return appVersionInfo;
        }
    }
}
