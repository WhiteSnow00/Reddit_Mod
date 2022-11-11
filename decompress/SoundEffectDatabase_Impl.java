// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.api.soundeffect;

import X.1JV;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import X.0Fo;
import java.util.HashSet;
import X.0Fv;
import X.0Ce;
import X.17V;
import X.0Cj;
import X.0Fl;
import java.util.Map;
import X.0GE;
import java.util.Set;
import java.util.HashMap;
import X.0G3;
import com.bytedance.covode.number.Covode;
import X.0go;

public final class SoundEffectDatabase_Impl extends SoundEffectDatabase
{
    public volatile 0go LJIIIZ;
    
    static {
        Covode.recordClassIndex(6235);
    }
    
    @Override
    public final 0G3 LIZ() {
        return new 0G3(this, new HashMap<String, String>(0), new HashMap<String, Set<String>>(0), new String[] { "sound_effect_database" });
    }
    
    @Override
    public final 0Cj LIZIZ(final 0Fl 0Fl) {
        final 17V lizj = new 17V(0Fl, (17V.a)new 17V.a() {
            static {
                Covode.recordClassIndex(6236);
            }
            
            @Override
            public final void LIZ() {
                if (SoundEffectDatabase_Impl.this.LJFF != null) {
                    for (int i = 0; i < SoundEffectDatabase_Impl.this.LJFF.size(); ++i) {
                        SoundEffectDatabase_Impl.this.LJFF.get(i);
                    }
                }
            }
            
            @Override
            public final void LIZ(final 0Ce 0Ce) {
                0Ce.LIZJ("DROP TABLE IF EXISTS `sound_effect_database`");
                if (SoundEffectDatabase_Impl.this.LJFF != null) {
                    for (int i = 0; i < SoundEffectDatabase_Impl.this.LJFF.size(); ++i) {
                        SoundEffectDatabase_Impl.this.LJFF.get(i);
                    }
                }
            }
            
            @Override
            public final void LIZIZ(final 0Ce 0Ce) {
                0Ce.LIZJ("CREATE TABLE IF NOT EXISTS `sound_effect_database` (`dbId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id` INTEGER NOT NULL, `name` TEXT NOT NULL, `eng_name` TEXT NOT NULL, `version` INTEGER NOT NULL, `resource_urlavg_color` TEXT, `resource_urluri` TEXT, `resource_urlurl_list` TEXT, `resource_urlopen_web_url` TEXT, `resource_urlimage_type` INTEGER, `resource_urlis_animated` INTEGER, `resource_urlwidth` INTEGER, `resource_urlheight` INTEGER, `resource_urlisLoaded` INTEGER, `resource_urlisMonitored` INTEGER, `resource_urlisFeedCandidate` INTEGER, `iconavg_color` TEXT, `iconuri` TEXT, `iconurl_list` TEXT, `iconopen_web_url` TEXT, `iconimage_type` INTEGER, `iconis_animated` INTEGER, `iconwidth` INTEGER, `iconheight` INTEGER, `iconisLoaded` INTEGER, `iconisMonitored` INTEGER, `iconisFeedCandidate` INTEGER)");
                0Ce.LIZJ("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                0Ce.LIZJ("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1f5f69edf7ad8512f8d862dfe970fcfb')");
            }
            
            @Override
            public final void LIZJ(final 0Ce liz) {
                SoundEffectDatabase_Impl.this.LIZ = liz;
                SoundEffectDatabase_Impl.this.LIZ(liz);
                if (SoundEffectDatabase_Impl.this.LJFF != null) {
                    for (int i = 0; i < SoundEffectDatabase_Impl.this.LJFF.size(); ++i) {
                        SoundEffectDatabase_Impl.this.LJFF.get(i);
                    }
                }
            }
            
            @Override
            public final 17V.b LJ(final 0Ce 0Ce) {
                final HashMap hashMap = new HashMap(27);
                hashMap.put("dbId", new 0Fv.a("dbId", "INTEGER", true, 1, null, 1));
                hashMap.put("id", new 0Fv.a("id", "INTEGER", true, 0, null, 1));
                hashMap.put("name", new 0Fv.a("name", "TEXT", true, 0, null, 1));
                hashMap.put("eng_name", new 0Fv.a("eng_name", "TEXT", true, 0, null, 1));
                hashMap.put("version", new 0Fv.a("version", "INTEGER", true, 0, null, 1));
                hashMap.put("resource_urlavg_color", new 0Fv.a("resource_urlavg_color", "TEXT", false, 0, null, 1));
                hashMap.put("resource_urluri", new 0Fv.a("resource_urluri", "TEXT", false, 0, null, 1));
                hashMap.put("resource_urlurl_list", new 0Fv.a("resource_urlurl_list", "TEXT", false, 0, null, 1));
                hashMap.put("resource_urlopen_web_url", new 0Fv.a("resource_urlopen_web_url", "TEXT", false, 0, null, 1));
                hashMap.put("resource_urlimage_type", new 0Fv.a("resource_urlimage_type", "INTEGER", false, 0, null, 1));
                hashMap.put("resource_urlis_animated", new 0Fv.a("resource_urlis_animated", "INTEGER", false, 0, null, 1));
                hashMap.put("resource_urlwidth", new 0Fv.a("resource_urlwidth", "INTEGER", false, 0, null, 1));
                hashMap.put("resource_urlheight", new 0Fv.a("resource_urlheight", "INTEGER", false, 0, null, 1));
                hashMap.put("resource_urlisLoaded", new 0Fv.a("resource_urlisLoaded", "INTEGER", false, 0, null, 1));
                hashMap.put("resource_urlisMonitored", new 0Fv.a("resource_urlisMonitored", "INTEGER", false, 0, null, 1));
                hashMap.put("resource_urlisFeedCandidate", new 0Fv.a("resource_urlisFeedCandidate", "INTEGER", false, 0, null, 1));
                hashMap.put("iconavg_color", new 0Fv.a("iconavg_color", "TEXT", false, 0, null, 1));
                hashMap.put("iconuri", new 0Fv.a("iconuri", "TEXT", false, 0, null, 1));
                hashMap.put("iconurl_list", new 0Fv.a("iconurl_list", "TEXT", false, 0, null, 1));
                hashMap.put("iconopen_web_url", new 0Fv.a("iconopen_web_url", "TEXT", false, 0, null, 1));
                hashMap.put("iconimage_type", new 0Fv.a("iconimage_type", "INTEGER", false, 0, null, 1));
                hashMap.put("iconis_animated", new 0Fv.a("iconis_animated", "INTEGER", false, 0, null, 1));
                hashMap.put("iconwidth", new 0Fv.a("iconwidth", "INTEGER", false, 0, null, 1));
                hashMap.put("iconheight", new 0Fv.a("iconheight", "INTEGER", false, 0, null, 1));
                hashMap.put("iconisLoaded", new 0Fv.a("iconisLoaded", "INTEGER", false, 0, null, 1));
                hashMap.put("iconisMonitored", new 0Fv.a("iconisMonitored", "INTEGER", false, 0, null, 1));
                hashMap.put("iconisFeedCandidate", new 0Fv.a("iconisFeedCandidate", "INTEGER", false, 0, null, 1));
                final 0Fv 0Fv = new 0Fv("sound_effect_database", hashMap, new HashSet<0Fv.b>(0), new HashSet<0Fv.d>(0));
                final 0Fv liz = X.0Fv.LIZ(0Ce, "sound_effect_database");
                if (!0Fv.equals(liz)) {
                    final StringBuilder sb = new StringBuilder("sound_effect_database(com.bytedance.android.live.effect.api.soundeffect.SoundEffect).\n Expected:\n");
                    sb.append(0Fv);
                    sb.append("\n Found:\n");
                    sb.append(liz);
                    return new 17V.b(false, sb.toString());
                }
                return new 17V.b(true, null);
            }
            
            @Override
            public final void LJFF(final 0Ce 0Ce) {
                0Fo.LIZ(0Ce);
            }
        }, "1f5f69edf7ad8512f8d862dfe970fcfb", "602aa792e5da8c5c7d64ed7e865a5651");
        final 0Cj.b.a liz = 0Cj.b.LIZ(0Fl.LIZIZ);
        liz.LIZIZ = 0Fl.LIZJ;
        liz.LIZJ = lizj;
        return 0Fl.LIZ.LIZ(liz.LIZ());
    }
    
    @Override
    public final 0go LJIIIIZZ() {
        MethodCollector.i(4790);
        if (this.LJIIIZ != null) {
            final 0go ljiiiz = this.LJIIIZ;
            MethodCollector.o(4790);
            return ljiiiz;
        }
        monitorenter(this);
        try {
            if (this.LJIIIZ == null) {
                this.LJIIIZ = new 1JV(this);
            }
            return this.LJIIIZ;
        }
        finally {
            monitorexit(this);
            MethodCollector.o(4790);
        }
    }
}
