// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.api.model;

import com.google.gson.s;
import X.0b8;
import X.H25;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.a.c;

public class Game
{
    @c(LIZ = "game_id")
    public long gameId;
    @c(LIZ = "icon")
    public ImageModel icon;
    @c(LIZ = "name")
    public String name;
    
    static {
        Covode.recordClassIndex(5078);
    }
    
    public static Game fromJson(final String s) {
        try {
            if (H25.LJII != null) {
                return (Game)H25.LJII.LIZ(s, (Class)Game.class);
            }
            return (Game)0b8.a.LIZIZ.LIZ(s, (Class)Game.class);
        }
        catch (final s s2) {
            return null;
        }
    }
    
    public String toJsonString() {
        if (H25.LJII != null) {
            return H25.LJII.LIZIZ((Object)this);
        }
        return 0b8.a.LIZIZ.LIZIZ((Object)this);
    }
}
