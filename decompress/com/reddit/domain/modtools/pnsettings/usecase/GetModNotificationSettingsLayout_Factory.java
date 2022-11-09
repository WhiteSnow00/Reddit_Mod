// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.pnsettings.usecase;

import q20.b;
import com.reddit.domain.modtools.pnsettings.ModNotificationSettingsRepository;
import javax.inject.Provider;
import af2.d;

public final class GetModNotificationSettingsLayout_Factory implements d<GetModNotificationSettingsLayout>
{
    private final Provider<ModNotificationSettingsRepository> repositoryProvider;
    private final Provider<b> resourceProvider;
    
    public GetModNotificationSettingsLayout_Factory(final Provider<ModNotificationSettingsRepository> repositoryProvider, final Provider<b> resourceProvider) {
        this.repositoryProvider = repositoryProvider;
        this.resourceProvider = resourceProvider;
    }
    
    public static GetModNotificationSettingsLayout_Factory create(final Provider<ModNotificationSettingsRepository> provider, final Provider<b> provider2) {
        return new GetModNotificationSettingsLayout_Factory(provider, provider2);
    }
    
    public static GetModNotificationSettingsLayout newInstance(final ModNotificationSettingsRepository modNotificationSettingsRepository, final b b) {
        return new GetModNotificationSettingsLayout(modNotificationSettingsRepository, b);
    }
    
    public GetModNotificationSettingsLayout get() {
        return newInstance((ModNotificationSettingsRepository)this.repositoryProvider.get(), (b)this.resourceProvider.get());
    }
}
