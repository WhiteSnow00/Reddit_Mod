// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.sociallink;

import ah2.f;
import java.util.LinkedHashMap;
import a4.u1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\u0001\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001!B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006\"" }, d2 = { "Lcom/reddit/domain/model/sociallink/SocialLinkType;", "", "string", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getString", "()Ljava/lang/String;", "REDDIT", "INSTAGRAM", "TWITTER", "TIKTOK", "TWITCH", "FACEBOOK", "YOUTUBE", "TUMBLR", "SPOTIFY", "SOUNDCLOUD", "BEACONS", "LINKTREE", "DISCORD", "CUSTOM", "VENMO", "CASH_APP", "KOFI", "PAYPAL", "CAMEO", "ONLYFANS", "SUBSTACK", "KICKSTARTER", "INDIEGOGO", "BUY_ME_A_COFFEE", "SHOPIFY", "PATREON", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum SocialLinkType
{
    BEACONS("BEACONS"), 
    BUY_ME_A_COFFEE("BUY_ME_A_COFFEE"), 
    CAMEO("CAMEO"), 
    CASH_APP("CASH_APP"), 
    CUSTOM("CUSTOM");
    
    public static final Companion Companion;
    
    DISCORD("DISCORD"), 
    FACEBOOK("FACEBOOK"), 
    INDIEGOGO("INDIEGOGO"), 
    INSTAGRAM("INSTAGRAM"), 
    KICKSTARTER("KICKSTARTER"), 
    KOFI("KOFI"), 
    LINKTREE("LINKTREE"), 
    ONLYFANS("ONLYFANS"), 
    PATREON("PATREON"), 
    PAYPAL("PAYPAL"), 
    REDDIT("REDDIT"), 
    SHOPIFY("SHOPIFY"), 
    SOUNDCLOUD("SOUNDCLOUD"), 
    SPOTIFY("SPOTIFY"), 
    SUBSTACK("SUBSTACK"), 
    TIKTOK("TIKTOK"), 
    TUMBLR("TUMBLR"), 
    TWITCH("TWITCH"), 
    TWITTER("TWITTER"), 
    VENMO("VENMO"), 
    YOUTUBE("YOUTUBE");
    
    private static final Map<String, SocialLinkType> map;
    private final String string;
    
    static {
        final int n = 0;
        int n2 = 16;
        Companion = new Companion(null);
        final SocialLinkType[] values = values();
        final int a0 = u1.A0(values.length);
        if (a0 >= 16) {
            n2 = a0;
        }
        final LinkedHashMap map2 = new LinkedHashMap(n2);
        for (int length = values.length, i = n; i < length; ++i) {
            final SocialLinkType socialLinkType = values[i];
            map2.put((Object)socialLinkType.string, (Object)socialLinkType);
        }
        map = map2;
    }
    
    private SocialLinkType(final String string) {
        this.string = string;
    }
    
    public static final /* synthetic */ Map access$getMap$cp() {
        return SocialLinkType.map;
    }
    
    public static final SocialLinkType fromString(final String s) {
        return SocialLinkType.Companion.fromString(s);
    }
    
    public final String getString() {
        return this.string;
    }
    
    @Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t" }, d2 = { "Lcom/reddit/domain/model/sociallink/SocialLinkType$Companion;", "", "()V", "map", "", "", "Lcom/reddit/domain/model/sociallink/SocialLinkType;", "fromString", "string", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final SocialLinkType fromString(final String s) {
            f.f((Object)s, "string");
            return SocialLinkType.access$getMap$cp().get(s);
        }
    }
}
