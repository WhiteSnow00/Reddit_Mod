// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import kotlin.collections.EmptySet;
import java.util.Set;
import qg2.d0;
import javax.inject.Inject;
import kotlin.a;
import pg2.f;
import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.y;
import c50.m0;

public final class FileStreamDataSource implements m0
{
    public final y a;
    public final SharedPreferences b;
    public final Context c;
    public final f d;
    public final f e;
    public final f f;
    
    @Inject
    public FileStreamDataSource(final y a, final SharedPreferences b, final Context c) {
        ah2.f.f((Object)a, "moshi");
        ah2.f.f((Object)b, "preferences");
        ah2.f.f((Object)c, "context");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = kotlin.a.b((zg2.a)new FileStreamDataSource$root.FileStreamDataSource$root$2(this));
        this.e = kotlin.a.b((zg2.a)new FileStreamDataSource$adapter.FileStreamDataSource$adapter$2(this));
        this.f = kotlin.a.b((zg2.a)new FileStreamDataSource$persister.FileStreamDataSource$persister$2(this));
    }
    
    @Override
    public final void a(final String s) {
        ah2.f.f((Object)s, "streamId");
        this.b.edit().putStringSet("reported_streams", (Set)d0.Q1((Set)this.d(), (Object)s)).apply();
    }
    
    @Override
    public final void b(final String s) {
        ah2.f.f((Object)s, "streamId");
        this.b.edit().putStringSet("ended_streams", (Set)d0.Q1((Set)this.e(), (Object)s)).apply();
    }
    
    @Override
    public final Set<String> d() {
        final SharedPreferences b = this.b;
        Object instance = EmptySet.INSTANCE;
        final Set stringSet = b.getStringSet("reported_streams", (Set)instance);
        if (stringSet != null) {
            instance = stringSet;
        }
        return (Set<String>)instance;
    }
    
    @Override
    public final Set<String> e() {
        final SharedPreferences b = this.b;
        Object instance = EmptySet.INSTANCE;
        final Set stringSet = b.getStringSet("ended_streams", (Set)instance);
        if (stringSet != null) {
            instance = stringSet;
        }
        return (Set<String>)instance;
    }
}
