// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.pnsettings.usecase;

import m20.b;
import com.reddit.domain.modtools.pnsettings.ModNotificationSettingsRepository;
import javax.inject.Provider;
import se2.d;

public final class UpdateModNotificationSetting_Factory implements d<UpdateModNotificationSetting>
{
    private final Provider<ModNotificationSettingsRepository> repositoryProvider;
    private final Provider<b> resourceProvider;
    
    public UpdateModNotificationSetting_Factory(final Provider<ModNotificationSettingsRepository> repositoryProvider, final Provider<b> resourceProvider) {
        this.repositoryProvider = repositoryProvider;
        this.resourceProvider = resourceProvider;
    }
    
    public static UpdateModNotificationSetting_Factory create(final Provider<ModNotificationSettingsRepository> provider, final Provider<b> provider2) {
        return new UpdateModNotificationSetting_Factory(provider, provider2);
    }
    
    public static UpdateModNotificationSetting newInstance(final ModNotificationSettingsRepository modNotificationSettingsRepository, final b b) {
        return new UpdateModNotificationSetting(modNotificationSettingsRepository, b);
    }
    
    public UpdateModNotificationSetting get() {
        return newInstance((ModNotificationSettingsRepository)this.repositoryProvider.get(), (b)this.resourceProvider.get());
    }
}
