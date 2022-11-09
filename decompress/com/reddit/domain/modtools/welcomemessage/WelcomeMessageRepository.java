// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.welcomemessage;

import tg2.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/modtools/welcomemessage/WelcomeMessageRepository;", "", "", "subredditId", "Lcom/reddit/domain/modtools/welcomemessage/WelcomeMessage;", "getWelcomeMessage", "(Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public interface WelcomeMessageRepository
{
    Object getWelcomeMessage(final String p0, final c<? super WelcomeMessage> p1);
}
