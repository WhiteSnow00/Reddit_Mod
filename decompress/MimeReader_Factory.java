// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.internal.player;

import kotlin.Metadata;
import se2.d;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0000H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b" }, d2 = { "Lcom/reddit/video/player/internal/player/MimeReader_Factory;", "Lse2/d;", "Lcom/reddit/video/player/internal/player/MimeReader;", "create", "newInstance", "get", "<init>", "()V", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class MimeReader_Factory implements d<MimeReader>
{
    public static final MimeReader_Factory INSTANCE;
    
    static {
        INSTANCE = new MimeReader_Factory();
    }
    
    private MimeReader_Factory() {
    }
    
    public static final MimeReader_Factory create() {
        return MimeReader_Factory.INSTANCE;
    }
    
    public static final MimeReader newInstance() {
        return new MimeReader();
    }
    
    public MimeReader get() {
        return newInstance();
    }
}
