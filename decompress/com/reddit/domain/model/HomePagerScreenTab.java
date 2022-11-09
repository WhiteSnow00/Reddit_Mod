// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0005\t\n\u000b\f\rB\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/model/HomePagerScreenTab;", "", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "AwardedTab", "Companion", "HomeTab", "NewsTab", "PopularTab", "Lcom/reddit/domain/model/HomePagerScreenTab$AwardedTab;", "Lcom/reddit/domain/model/HomePagerScreenTab$HomeTab;", "Lcom/reddit/domain/model/HomePagerScreenTab$NewsTab;", "Lcom/reddit/domain/model/HomePagerScreenTab$PopularTab;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class HomePagerScreenTab
{
    public static final Companion Companion;
    private final String id;
    private final String name;
    
    static {
        Companion = new Companion(null);
    }
    
    private HomePagerScreenTab(final String id, final String name) {
        this.id = id;
        this.name = name;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/HomePagerScreenTab$Companion;", "", "()V", "getById", "Lcom/reddit/domain/model/HomePagerScreenTab;", "id", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final HomePagerScreenTab getById(final String s) {
            f.f((Object)s, "id");
            switch (s) {
                case "news": {
                    final Object o = HomePagerScreenTab$NewsTab.INSTANCE;
                    return (HomePagerScreenTab)o;
                }
                case "home": {
                    final Object o = HomePagerScreenTab$HomeTab.INSTANCE;
                    return (HomePagerScreenTab)o;
                }
                case "popular": {
                    final Object o = HomePagerScreenTab$PopularTab.INSTANCE;
                    return (HomePagerScreenTab)o;
                }
                case "awarded": {
                    final Object o = HomePagerScreenTab$AwardedTab.INSTANCE;
                    return (HomePagerScreenTab)o;
                }
                default:
                    break;
            }
            final Object o = HomePagerScreenTab$HomeTab.INSTANCE;
            return (HomePagerScreenTab)o;
        }
    }
}
