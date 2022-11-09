// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import av2.o;
import av2.e;
import nf2.a;
import av2.c;
import av2.f;
import com.reddit.domain.repository.NotificationSettingsRepository;
import nf2.c0;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0012\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¨\u0006\t" }, d2 = { "Lcom/reddit/data/remote/RemoteNotificationSettingsDataSource;", "", "Lnf2/c0;", "Lcom/reddit/domain/repository/NotificationSettingsRepository$Settings;", "getSettings", "Lcom/reddit/domain/repository/NotificationSettingsRepository$SettingsPatch;", "settings", "Lnf2/a;", "patchSettings", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteNotificationSettingsDataSource
{
    @f("/redditmobile/1/push/preferences")
    c0<NotificationSettingsRepository.Settings> getSettings();
    
    @e
    @o("/redditmobile/1/push/preferences")
    a patchSettings(@c("preferences") final NotificationSettingsRepository.SettingsPatch p0);
}
