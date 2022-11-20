// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.services.AccountService;
import java.io.IOException;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.TwitterCoreScribeClientHolder;
import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import com.twitter.sdk.android.core.TwitterSession;

public class TwitterSessionVerifier implements SessionVerifier<TwitterSession>
{
    public static final String SCRIBE_ACTION = "impression";
    public static final String SCRIBE_CLIENT = "android";
    public static final String SCRIBE_COMPONENT = "";
    public static final String SCRIBE_ELEMENT = "";
    public static final String SCRIBE_PAGE = "credentials";
    public static final String SCRIBE_SECTION = "";
    private final TwitterSessionVerifier.TwitterSessionVerifier$AccountServiceProvider accountServiceProvider;
    private final DefaultScribeClient scribeClient;
    
    public TwitterSessionVerifier() {
        this.accountServiceProvider = new TwitterSessionVerifier.TwitterSessionVerifier$AccountServiceProvider();
        this.scribeClient = TwitterCoreScribeClientHolder.getScribeClient();
    }
    
    public TwitterSessionVerifier(final TwitterSessionVerifier.TwitterSessionVerifier$AccountServiceProvider accountServiceProvider, final DefaultScribeClient scribeClient) {
        this.accountServiceProvider = accountServiceProvider;
        this.scribeClient = scribeClient;
    }
    
    private void scribeVerifySession() {
        if (this.scribeClient == null) {
            return;
        }
        this.scribeClient.scribe(new EventNamespace$Builder().setClient("android").setPage("credentials").setSection("").setComponent("").setElement("").setAction("impression").builder());
    }
    
    public /* bridge */ void verifySession(final Session session) {
        this.verifySession((TwitterSession)session);
    }
    
    public void verifySession(final TwitterSession twitterSession) {
        final AccountService accountService = this.accountServiceProvider.getAccountService(twitterSession);
        try {
            this.scribeVerifySession();
            final Boolean true = Boolean.TRUE;
            final Boolean false = Boolean.FALSE;
            accountService.verifyCredentials(true, false, false).execute();
        }
        catch (final IOException | RuntimeException ex) {}
    }
}
