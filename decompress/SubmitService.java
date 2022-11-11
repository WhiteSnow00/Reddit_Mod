// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.postsubmit;

import com.reddit.domain.model.GenericResponse;
import com.reddit.domain.model.PostSubmitValidationErrors;
import com.reddit.domain.model.SubmitImageResponse;
import java.util.List;
import com.reddit.domain.model.SubmitPostErrorResponse;
import com.reddit.logging.Step;
import com.reddit.logging.Scenario;
import com.reddit.domain.model.DiscussionType;
import android.content.Intent;
import ge0.z;
import android.content.Context;
import a4.u1;
import t50.f;
import android.os.Handler;
import com.reddit.domain.model.SubmitResponse;
import android.text.TextUtils;
import o41.i$a;
import com.reddit.domain.model.events.SubmitEvents;
import de.greenrobot.event.EventBus;
import com.reddit.data.model.v2.live.RedirectUpdater;
import android.net.Uri;
import android.os.HandlerThread;
import jw0.c;
import com.reddit.data.postsubmit.service.ImageSubmitServiceDelegate;
import db0.v;
import jw0.a;
import e80.d;
import db0.s;
import d60.e0;
import d60.d0;
import o41.j;
import android.app.IntentService;

public class SubmitService extends IntentService
{
    public static final /* synthetic */ int o = 0;
    public j f;
    public d0 g;
    public e0 h;
    public s i;
    public d j;
    public a k;
    public v l;
    public ImageSubmitServiceDelegate m;
    public c n;
    
    public SubmitService() {
        super("SubmitService");
    }
    
    public final void a(final String s, final String s2, final String s3) {
        final HandlerThread handlerThread = new HandlerThread("imageUpload", 1);
        ((Thread)handlerThread).start();
        this.f = (j)this.h.a(Uri.parse(s2), new RedirectUpdater() {
            @Override
            public final void onFailure(final Throwable t, final String s) {
                final SubmitService d = SubmitService.this;
                final int o = SubmitService.o;
                d.k.c((Throwable)new ImageSubmitServiceDelegate.OriginalSubmitServiceException(s, t));
                EventBus.getDefault().post((Object)new SubmitEvents.SubmitErrorEvent(s, new Exception(s)));
                ((i$a)SubmitService.this.f).a();
            }
            
            @Override
            public final void onRedirect(String b) {
                if (!TextUtils.isEmpty((CharSequence)b)) {
                    b = SubmitService.this.j.b(b);
                    EventBus.getDefault().post((Object)new SubmitEvents.SubmitImageResultEvent(s, b));
                    handlerThread.quit();
                }
                EventBus.getDefault().post((Object)new SubmitEvents.SubmitResultEvent(s, null, s3));
                ((i$a)SubmitService.this.f).a();
            }
        });
        new Handler(handlerThread.getLooper()).postDelayed((Runnable)new f((Object)this, (Object)s, (Object)s3, (Object)handlerThread, 0), 60000L);
    }
    
    public final void onCreate() {
        super.onCreate();
        final y90.e0 g0 = u1.g0((Context)this);
        this.g = g0.r1();
        this.h = g0.C3();
        this.i = g0.n7();
        this.j = g0.x8();
        this.k = g0.a();
        this.n = (c)g0.C0();
        final v z7 = g0.z7();
        this.l = z7;
        this.m = new ImageSubmitServiceDelegate(z7, (z)g0.R4(), this.k, this.n, g0.E2());
    }
    
    public final void onHandleIntent(final Intent intent) {
        final String stringExtra = intent.getStringExtra("submit_request_id");
        final String stringExtra2 = intent.getStringExtra("submit_subreddit");
        final String stringExtra3 = intent.getStringExtra("submit_title");
        final String stringExtra4 = intent.getStringExtra("submit_body_text");
        final String stringExtra5 = intent.getStringExtra("submit_image");
        final String stringExtra6 = intent.getStringExtra("submit_flair_text");
        final String stringExtra7 = intent.getStringExtra("submit_flair_id");
        final DiscussionType discussionType = (DiscussionType)intent.getSerializableExtra("submit_discussion_type");
        final boolean booleanExtra = intent.getBooleanExtra("submit_is_nsfw", false);
        final boolean booleanExtra2 = intent.getBooleanExtra("submit_is_spoiler", false);
        if (this.l.Y3()) {
            final String c = this.m.c(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra7, discussionType, booleanExtra, booleanExtra2, stringExtra6, stringExtra5);
            if (c != null) {
                this.a(stringExtra, c, stringExtra2);
            }
            return;
        }
        final boolean empty = TextUtils.isEmpty((CharSequence)stringExtra5);
        Object o = null;
        final SubmitImageResponse submitImageResponse = null;
        if (!empty) {
            try {
                o = this.g.e(stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, discussionType, booleanExtra, booleanExtra2).e();
            }
            catch (final Exception ex) {
                this.k.c((Throwable)new ImageSubmitServiceDelegate.OriginalSubmitServiceException("Submit image failed", ex));
                o = submitImageResponse;
            }
            this.n.a(Scenario.PostSubmission, Step.End, "image");
        }
        if (o == null) {
            final Exception ex2 = new Exception("Response is null");
            this.k.c((Throwable)new ImageSubmitServiceDelegate.OriginalSubmitServiceException(ex2.getMessage(), ex2));
            EventBus.getDefault().post((Object)new SubmitEvents.SubmitErrorEvent(stringExtra, ex2));
            return;
        }
        if (((GenericResponse)o).hasErrors()) {
            final ImageSubmitServiceDelegate m = this.m;
            m.getClass();
            ah2.f.f((Object)stringExtra, "requestId");
            final boolean p = m.a.p2();
            final PostSubmitValidationErrors validationErrors = new SubmitPostErrorResponse((List)((GenericResponse)o).getJson().getErrors()).getValidationErrors(p);
            Exception b;
            if (p) {
                b = ImageSubmitServiceDelegate.b(validationErrors);
            }
            else {
                b = new SubmitEvents.SubmitErrorEvent.ErrorResponseException(((GenericResponse)o).getFirstError(), validationErrors);
            }
            m.d(stringExtra, b);
            return;
        }
        this.a(stringExtra, ((SubmitImageResponse)o).getWebsocketUrl(), stringExtra2);
    }
}
