// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.identity;

import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.services.AccountService;
import nu2.d;
import nu2.w;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.models.User;
import al0.g7;
import android.content.Intent;
import com.twitter.sdk.android.core.internal.scribe.TwitterCoreScribeClientHolder;
import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterAuthException;
import android.content.Context;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Twitter;
import android.app.Activity;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.TwitterAuthConfig;

public class TwitterAuthClient
{
    private static final String SCRIBE_ACTION = "impression";
    private static final String SCRIBE_CLIENT = "android";
    private static final String SCRIBE_COMPONENT = "";
    private static final String SCRIBE_ELEMENT = "";
    private static final String SCRIBE_LOGIN_PAGE = "login";
    private static final String SCRIBE_SECTION = "";
    private static final String SCRIBE_SHARE_EMAIL_PAGE = "shareemail";
    public final TwitterAuthConfig authConfig;
    public final AuthState authState;
    public final SessionManager<TwitterSession> sessionManager;
    public final TwitterCore twitterCore;
    
    public TwitterAuthClient() {
        this(TwitterCore.getInstance(), TwitterCore.getInstance().getAuthConfig(), TwitterCore.getInstance().getSessionManager(), AuthStateLazyHolder.access$000());
    }
    
    public TwitterAuthClient(final TwitterCore twitterCore, final TwitterAuthConfig authConfig, final SessionManager<TwitterSession> sessionManager, final AuthState authState) {
        this.twitterCore = twitterCore;
        this.authState = authState;
        this.authConfig = authConfig;
        this.sessionManager = sessionManager;
    }
    
    private boolean authorizeUsingOAuth(final Activity activity, final CallbackWrapper callbackWrapper) {
        Twitter.getLogger().d("Twitter", "Using OAuth");
        final AuthState authState = this.authState;
        final TwitterAuthConfig authConfig = this.authConfig;
        return authState.beginAuthorize(activity, (AuthHandler)new OAuthHandler(authConfig, (Callback)callbackWrapper, authConfig.getRequestCode()));
    }
    
    private boolean authorizeUsingSSO(final Activity activity, final CallbackWrapper callbackWrapper) {
        if (SSOAuthHandler.isAvailable((Context)activity)) {
            Twitter.getLogger().d("Twitter", "Using SSO");
            final AuthState authState = this.authState;
            final TwitterAuthConfig authConfig = this.authConfig;
            return authState.beginAuthorize(activity, (AuthHandler)new SSOAuthHandler(authConfig, (Callback)callbackWrapper, authConfig.getRequestCode()));
        }
        return false;
    }
    
    private void handleAuthorize(final Activity activity, final Callback<TwitterSession> callback) {
        this.scribeAuthorizeImpression();
        final CallbackWrapper callbackWrapper = new CallbackWrapper(this.sessionManager, callback);
        if (!this.authorizeUsingSSO(activity, callbackWrapper) && !this.authorizeUsingOAuth(activity, callbackWrapper)) {
            callbackWrapper.failure((TwitterException)new TwitterAuthException("Authorize failed."));
        }
    }
    
    private void scribeAuthorizeImpression() {
        final DefaultScribeClient scribeClient = this.getScribeClient();
        if (scribeClient == null) {
            return;
        }
        scribeClient.scribe(new EventNamespace[] { new EventNamespace.Builder().setClient("android").setPage("login").setSection("").setComponent("").setElement("").setAction("impression").builder() });
    }
    
    private void scribeRequestEmail() {
        final DefaultScribeClient scribeClient = this.getScribeClient();
        if (scribeClient == null) {
            return;
        }
        scribeClient.scribe(new EventNamespace[] { new EventNamespace.Builder().setClient("android").setPage("shareemail").setSection("").setComponent("").setElement("").setAction("impression").builder() });
    }
    
    public void authorize(final Activity activity, final Callback<TwitterSession> callback) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity must not be null.");
        }
        if (callback != null) {
            if (activity.isFinishing()) {
                Twitter.getLogger().e("Twitter", "Cannot authorize, activity is finishing.", (Throwable)null);
            }
            else {
                this.handleAuthorize(activity, callback);
            }
            return;
        }
        throw new IllegalArgumentException("Callback must not be null.");
    }
    
    public void cancelAuthorize() {
        this.authState.endAuthorize();
    }
    
    public int getRequestCode() {
        return this.authConfig.getRequestCode();
    }
    
    public DefaultScribeClient getScribeClient() {
        return TwitterCoreScribeClientHolder.getScribeClient();
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        Twitter.getLogger().d("Twitter", g7.f("onActivityResult called with ", n, " ", n2));
        if (!this.authState.isAuthorizeInProgress()) {
            Twitter.getLogger().e("Twitter", "Authorize not in progress", (Throwable)null);
        }
        else {
            final AuthHandler authHandler = this.authState.getAuthHandler();
            if (authHandler != null && authHandler.handleOnActivityResult(n, n2, intent)) {
                this.authState.endAuthorize();
            }
        }
    }
    
    public void requestEmail(final TwitterSession twitterSession, final Callback<String> callback) {
        this.scribeRequestEmail();
        final AccountService accountService = this.twitterCore.getApiClient(twitterSession).getAccountService();
        final Boolean false = Boolean.FALSE;
        accountService.verifyCredentials(false, false, Boolean.TRUE).w0((d)new Callback<User>() {
            public void failure(final TwitterException ex) {
                callback.failure(ex);
            }
            
            public void success(final Result<User> result) {
                callback.success(new Result((Object)((User)result.data).email, (w)null));
            }
        });
    }
    
    public static class AuthStateLazyHolder
    {
        private static final AuthState INSTANCE;
        
        static {
            INSTANCE = new AuthState();
        }
        
        private AuthStateLazyHolder() {
        }
        
        public static /* synthetic */ AuthState access$000() {
            return AuthStateLazyHolder.INSTANCE;
        }
    }
    
    public static class CallbackWrapper extends Callback<TwitterSession>
    {
        private final Callback<TwitterSession> callback;
        private final SessionManager<TwitterSession> sessionManager;
        
        public CallbackWrapper(final SessionManager<TwitterSession> sessionManager, final Callback<TwitterSession> callback) {
            this.sessionManager = sessionManager;
            this.callback = callback;
        }
        
        public void failure(final TwitterException ex) {
            Twitter.getLogger().e("Twitter", "Authorization completed with an error", (Throwable)ex);
            this.callback.failure(ex);
        }
        
        public void success(final Result<TwitterSession> result) {
            Twitter.getLogger().d("Twitter", "Authorization completed successfully");
            this.sessionManager.setActiveSession((Session)result.data);
            this.callback.success((Result)result);
        }
    }
}
