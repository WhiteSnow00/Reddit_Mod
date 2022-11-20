// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.reddit.domain.repository.SettingsLayoutChannel;
import com.reddit.domain.model.UpdateResponse;
import gg2.c;
import com.reddit.domain.model.inbox.SubredditNotificationSettings;

public interface h
{
    Object a(final SubredditNotificationSettings p0, final c<? super UpdateResponse> p1);
    
    Object b(final String p0, final boolean p1, final c<? super UpdateResponse> p2);
    
    Object c(final c<? super UpdateResponse> p0);
    
    Object d(final SettingsLayoutChannel p0, final ContinuationImpl p1);
}
