// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import android.content.Context;
import android.app.Activity;
import java.io.InputStream;
import android.os.Parcelable;
import com.reddit.data.model.appconfiguration.AppConfiguration;
import com.reddit.domain.model.streaming.StateType;
import com.reddit.feature.pagingviewstream.PageableViewStreamPresenter;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.util.UUID;
import java.io.File;
import android.net.Uri;
import com.reddit.sharing.ShareActivity;
import cg2.j;
import ry1.b$a;
import ry1.b;
import com.reddit.common.thread.ThreadUtil;
import ng2.e;
import ry1.a;
import com.reddit.video.creation.usecases.render.RenderVideoUseCase;
import java.util.concurrent.Callable;

public final class o implements Callable
{
    public final int f;
    public final Object g;
    
    public o(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object call() {
        final int f = this.f;
        final int n = 0;
        switch (f) {
            default: {
                return RenderVideoUseCase.b((RenderVideoUseCase)this.g);
            }
            case 3: {
                final a a = (a)this.g;
                e.f((Object)a, "this$0");
                final ThreadUtil a2 = ThreadUtil.a;
                final AppConfiguration appConfigInStagingIfNewer = a.a.getAppConfigInStagingIfNewer();
                if (appConfigInStagingIfNewer != null) {
                    a.a.persistAppConfig(appConfigInStagingIfNewer);
                    a.a.clearAppConfigInStaging();
                    pu2.a.a.a("Using app config from staging", new Object[0]);
                }
                else {
                    a.a.getAppConfig();
                    pu2.a.a.a("Using existing app config", new Object[0]);
                }
                final int p = b.p;
                b$a.a();
                return j.a;
            }
            case 2: {
                final ShareActivity shareActivity = (ShareActivity)this.g;
                final int m = ShareActivity.m;
                e.f((Object)shareActivity, "this$0");
                final Parcelable parcelableExtra = ((Activity)shareActivity).getIntent().getParcelableExtra("android.intent.extra.STREAM");
                e.c((Object)parcelableExtra);
                final Uri uri = (Uri)parcelableExtra;
                if (e.a((Object)uri.normalizeScheme().getScheme(), (Object)"file") && uri.getPath() != null) {
                    final String path = uri.getPath();
                    e.c((Object)path);
                    final File canonicalFile = new File(path).getCanonicalFile();
                    final File parentFile = ((Context)shareActivity).getFilesDir().getCanonicalFile().getParentFile();
                    e.c((Object)parentFile);
                    e.e((Object)canonicalFile, "file");
                    final lg2.a p2 = zg.a.p0(canonicalFile);
                    final lg2.a p3 = zg.a.p0(parentFile);
                    boolean equals = false;
                    Label_0362: {
                        if (e.a((Object)p2.a, (Object)p3.a)) {
                            if (p2.b.size() >= p3.b.size()) {
                                equals = p2.b.subList(0, p3.b.size()).equals(p3.b);
                                break Label_0362;
                            }
                        }
                        equals = false;
                    }
                    if (equals) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Uri ");
                        sb.append(uri);
                        sb.append(" is not valid");
                        throw new RuntimeException(sb.toString());
                    }
                }
                final InputStream openInputStream = ((Context)shareActivity).getContentResolver().openInputStream(uri);
                final File cacheDir = ((Context)shareActivity).getCacheDir();
                e.e((Object)cacheDir, "cacheDir");
                File file = new File("share_temp");
                final String path2 = file.getPath();
                e.e((Object)path2, "path");
                if (zg.a.Q(path2) <= 0) {
                    final String string = cacheDir.toString();
                    e.e((Object)string, "this.toString()");
                    int n2 = n;
                    if (string.length() == 0) {
                        n2 = 1;
                    }
                    if (n2 == 0 && !kotlin.text.b.L0((CharSequence)string, File.separatorChar)) {
                        final StringBuilder t = a.t(string);
                        t.append(File.separatorChar);
                        t.append(file);
                        file = new File(t.toString());
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(string);
                        sb2.append(file);
                        file = new File(sb2.toString());
                    }
                }
                file.mkdirs();
                final File file2 = new File(file, UUID.randomUUID().toString());
                final FileOutputStream fileOutputStream = new FileOutputStream(file2);
                if (openInputStream != null) {
                    try {
                        xd.a.M(openInputStream, (OutputStream)fileOutputStream, 8192);
                    }
                    finally {
                        try {}
                        finally {
                            zd.b.u(fileOutputStream, (Throwable)file2);
                        }
                    }
                }
                zd.b.u(fileOutputStream, null);
                file2.deleteOnExit();
                return file2;
            }
            case 1: {
                final PageableViewStreamPresenter pageableViewStreamPresenter = (PageableViewStreamPresenter)this.g;
                e.f((Object)pageableViewStreamPresenter, "this$0");
                return pageableViewStreamPresenter.h.c(System.currentTimeMillis(), StateType.VIEWER);
            }
            case 0: {
                return new i0((h)this.g);
            }
        }
    }
}
