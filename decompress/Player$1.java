// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.live.player;

import de2.a$c$d;
import sg2.e;
import kotlin.Metadata;
import de2.a;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n" }, d2 = { "Lde2/a;", "it", "", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class Player$1 extends Lambda implements l<a, Boolean>
{
    public static final Player$1 INSTANCE;
    
    static {
        INSTANCE = new Player$1();
    }
    
    public Player$1() {
        super(1);
    }
    
    public final boolean invoke(final a a) {
        e.f((Object)a, "it");
        return a instanceof a$c$d;
    }
}
