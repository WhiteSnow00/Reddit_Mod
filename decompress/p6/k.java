// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import android.content.Context;
import java.io.FileOutputStream;
import gj.f;
import c60.k0;
import com.reddit.data.model.VideoUpload;
import io.reactivex.subjects.PublishSubject;
import android.os.Parcelable;
import java.io.InputStream;
import com.reddit.domain.model.CommentKt;
import java.util.List;
import com.reddit.comment.data.repository.RedditCommentRepository;
import com.reddit.data.local.DatabaseAccountDataSource;
import com.reddit.data.local.DatabaseLinkDataSource;
import d60.p;
import com.reddit.domain.model.Subreddit;
import cg2.j;
import com.reddit.data.local.RedditLocalSubredditDataSource;
import com.squareup.moshi.JsonAdapter;
import com.reddit.data.local.d;
import com.reddit.data.postsubmit.VideoUploadService;
import j41.f$a;
import com.reddit.data.model.v2.live.RedirectUpdate$Redirect;
import java.io.Closeable;
import zd.b;
import java.io.OutputStream;
import xd.a;
import java.io.BufferedOutputStream;
import android.provider.MediaStore$Images$Media;
import android.content.ContentValues;
import android.net.Uri;
import ng2.e;
import com.reddit.sharing.ShareActivity;
import android.content.Intent;
import java.util.concurrent.Callable;

public final class k implements Callable
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public k(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object call() {
        final int f = this.f;
        boolean booleanValue = false;
        final boolean b = false;
        switch (f) {
            default: {
                final Intent intent = (Intent)this.g;
                final ShareActivity shareActivity = (ShareActivity)this.h;
                final int m = ShareActivity.m;
                e.f((Object)intent, "$intent");
                e.f((Object)shareActivity, "this$0");
                final Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
                e.c((Object)parcelableExtra);
                final Uri uri = (Uri)parcelableExtra;
                final ContentValues contentValues = new ContentValues();
                final long currentTimeMillis = System.currentTimeMillis();
                final StringBuilder sb = new StringBuilder();
                sb.append("reddit_image_");
                sb.append(currentTimeMillis);
                contentValues.put("title", sb.toString());
                contentValues.put("mime_type", "image/png");
                contentValues.put("date_added", Long.valueOf(currentTimeMillis));
                contentValues.put("datetaken", Long.valueOf(currentTimeMillis));
                final Uri insert = ((Context)shareActivity).getContentResolver().insert(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, contentValues);
                e.c((Object)insert);
                final OutputStream openOutputStream = ((Context)shareActivity).getContentResolver().openOutputStream(insert);
                if (openOutputStream != null) {
                    BufferedOutputStream bufferedOutputStream;
                    if (openOutputStream instanceof BufferedOutputStream) {
                        bufferedOutputStream = (BufferedOutputStream)openOutputStream;
                    }
                    else {
                        bufferedOutputStream = new BufferedOutputStream(openOutputStream, 8192);
                    }
                    try {
                        final InputStream openInputStream = ((Context)shareActivity).getContentResolver().openInputStream(uri);
                        if (openInputStream != null) {
                            try {
                                a.M(openInputStream, (OutputStream)bufferedOutputStream, 8192);
                            }
                            finally {
                                try {}
                                finally {
                                    final Throwable t;
                                    zd.b.u(openInputStream, t);
                                }
                            }
                        }
                        zd.b.u(openInputStream, null);
                        zd.b.u(bufferedOutputStream, null);
                    }
                    finally {
                        try {}
                        finally {
                            final Throwable t2;
                            zd.b.u(bufferedOutputStream, t2);
                        }
                    }
                }
                return insert;
            }
            case 9: {
                ((RedirectUpdate$Redirect)this.h).resolve(((f$a)this.g).a);
                return null;
            }
            case 8: {
                final VideoUploadService videoUploadService = (VideoUploadService)this.g;
                final String s = (String)this.h;
                final PublishSubject h = VideoUploadService.H;
                videoUploadService.getClass();
                final VideoUpload h2 = VideoUploadService.h(s);
                boolean b2 = b;
                if (h2 != null) {
                    b2 = b;
                    if (videoUploadService.j(h2)) {
                        b2 = true;
                    }
                }
                return b2;
            }
            case 7: {
                final d d = (d)this.g;
                final String s2 = (String)this.h;
                final String d2 = com.reddit.data.local.d.d;
                e.f((Object)d, "this$0");
                final Object value = d.c.getValue();
                e.e(value, "<get-adapter>(...)");
                return ((JsonAdapter)value).fromJson(s2);
            }
            case 6: {
                final RedditLocalSubredditDataSource redditLocalSubredditDataSource = (RedditLocalSubredditDataSource)this.g;
                final String s3 = (String)this.h;
                e.f((Object)redditLocalSubredditDataSource, "this$0");
                e.f((Object)s3, "$subredditId");
                redditLocalSubredditDataSource.e.i(s3);
                return j.a;
            }
            case 5: {
                final RedditLocalSubredditDataSource redditLocalSubredditDataSource2 = (RedditLocalSubredditDataSource)this.g;
                final Subreddit subreddit = (Subreddit)this.h;
                e.f((Object)redditLocalSubredditDataSource2, "this$0");
                e.f((Object)subreddit, "$subreddit");
                final k0 f2 = redditLocalSubredditDataSource2.f;
                final String id = subreddit.getId();
                final String kindWithId = subreddit.getKindWithId();
                final String displayName = subreddit.getDisplayName();
                final String displayNamePrefixed = subreddit.getDisplayNamePrefixed();
                final String iconImg = subreddit.getIconImg();
                String keyColor = subreddit.getKeyColor();
                if (keyColor == null) {
                    keyColor = "";
                }
                final String url = subreddit.getUrl();
                String description = subreddit.getDescription();
                if (description == null) {
                    description = "";
                }
                final String publicDescription = subreddit.getPublicDescription();
                final Long subscribers = subreddit.getSubscribers();
                long longValue;
                if (subscribers != null) {
                    longValue = subscribers;
                }
                else {
                    longValue = 0L;
                }
                final String bannerImg = subreddit.getBannerImg();
                final Boolean over18 = subreddit.getOver18();
                final boolean b3 = over18 != null && over18;
                final String subredditType = subreddit.getSubredditType();
                final long currentTimeMillis2 = System.currentTimeMillis();
                final long createdUtc = subreddit.getCreatedUtc();
                final String contentCategory = subreddit.getContentCategory();
                final Boolean quarantined = subreddit.getQuarantined();
                final String quarantineMessage = subreddit.getQuarantineMessage();
                final Boolean allowChatPostCreation = subreddit.getAllowChatPostCreation();
                final Boolean chatPostFeatureEnabled = subreddit.isChatPostFeatureEnabled();
                final Boolean userIsModerator = subreddit.getUserIsModerator();
                if (userIsModerator != null) {
                    booleanValue = userIsModerator;
                }
                f2.d1(new p(id, kindWithId, displayName, displayNamePrefixed, iconImg, keyColor, description, publicDescription, (String)null, url, longValue, subreddit.getAccountsActive(), bannerImg, b3, subredditType, currentTimeMillis2, createdUtc, (String)null, (String)null, contentCategory, quarantined, quarantineMessage, (String)null, allowChatPostCreation, chatPostFeatureEnabled, Boolean.valueOf(booleanValue), subreddit.getCommunityIconUrl(), subreddit.getSubmitType(), subreddit.getAllowImages(), subreddit.getSpoilersEnabled(), subreddit.getAllowPolls(), subreddit.getAllowPredictions(), subreddit.getAllowVideos(), Boolean.valueOf(subreddit.isMyReddit()), Boolean.valueOf(subreddit.isMuted())));
                return Boolean.TRUE;
            }
            case 4: {
                final DatabaseLinkDataSource databaseLinkDataSource = (DatabaseLinkDataSource)this.g;
                final String s4 = (String)this.h;
                e.f((Object)databaseLinkDataSource, "this$0");
                e.f((Object)s4, "$linkId");
                databaseLinkDataSource.Y().J1(s4, false);
                return j.a;
            }
            case 3: {
                final DatabaseAccountDataSource databaseAccountDataSource = (DatabaseAccountDataSource)this.g;
                final String s5 = (String)this.h;
                e.f((Object)databaseAccountDataSource, "this$0");
                e.f((Object)s5, "$accountId");
                final Object value2 = databaseAccountDataSource.c.get();
                e.e(value2, "mutationsDaoProvider.get()");
                ((c60.d)value2).i(s5);
                return j.a;
            }
            case 2: {
                final RedditCommentRepository redditCommentRepository = (RedditCommentRepository)this.g;
                final List list = (List)this.h;
                e.f((Object)redditCommentRepository, "this$0");
                e.f((Object)list, "$comments");
                redditCommentRepository.d.b(CommentKt.toAbbreviatedComments(list));
                return j.a;
            }
            case 1: {
                final gj.b b4 = (gj.b)this.g;
                final com.google.firebase.remoteconfig.internal.a a = (com.google.firebase.remoteconfig.internal.a)this.h;
                final f b5 = b4.b;
                synchronized (b5) {
                    final FileOutputStream openFileOutput = b5.a.openFileOutput(b5.b, 0);
                    try {
                        openFileOutput.write(a.toString().getBytes("UTF-8"));
                        return null;
                    }
                    finally {
                        openFileOutput.close();
                    }
                }
            }
            case 0: {
                return r.d((InputStream)this.g, (String)this.h);
            }
        }
    }
}
