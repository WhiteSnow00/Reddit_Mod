// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.appconfiguration;

import ah2.f;
import zg2.a;
import kotlin.Metadata;
import cb0.c;

@Metadata(bv = {}, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018" }, d2 = { "Lcom/reddit/data/model/appconfiguration/RedditAppConfigDelegate;", "Lcb0/c;", "Le20/a;", "dispatcherProvider", "Lff0/a;", "surveyConfigJsonParser", "Lgf0/a;", "getSurveyConfig", "(Le20/a;Lff0/a;Ltg2/c;)Ljava/lang/Object;", "", "getGetPremiumSettingsWebUrl", "()Ljava/lang/String;", "getPremiumSettingsWebUrl", "getGetPremiumSettingsPlayStoreUrl", "getPremiumSettingsPlayStoreUrl", "getGetCoinsHelpPageUrl", "getCoinsHelpPageUrl", "getGetAwardsHelpPageUrl", "getAwardsHelpPageUrl", "Lkotlin/Function0;", "Lcom/reddit/data/model/appconfiguration/AppConfiguration;", "appConfig", "<init>", "(Lzg2/a;)V", "app-config_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditAppConfigDelegate implements c
{
    private final a<AppConfiguration> appConfig;
    
    public RedditAppConfigDelegate(final a<? extends AppConfiguration> appConfig) {
        f.f((Object)appConfig, "appConfig");
        this.appConfig = (a<AppConfiguration>)appConfig;
    }
    
    @Override
    public String getGetAwardsHelpPageUrl() {
        return AppConfigurationKt.getAwardsHelpPageUrl((AppConfiguration)this.appConfig.invoke());
    }
    
    @Override
    public String getGetCoinsHelpPageUrl() {
        return AppConfigurationKt.getCoinsHelpPageUrl((AppConfiguration)this.appConfig.invoke());
    }
    
    @Override
    public String getGetPremiumSettingsPlayStoreUrl() {
        return AppConfigurationKt.getPremiumSettingsPlayStoreUrl((AppConfiguration)this.appConfig.invoke());
    }
    
    @Override
    public String getGetPremiumSettingsWebUrl() {
        return AppConfigurationKt.getPremiumSettingsWebUrl((AppConfiguration)this.appConfig.invoke());
    }
    
    public Object getSurveyConfig(final e20.a a, final ff0.a a2, final tg2.c<? super gf0.a> c) {
        return AppConfigurationKt.getSurveyConfig((AppConfiguration)this.appConfig.invoke(), a, a2, (tg2.c)c);
    }
}
