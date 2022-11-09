// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import okhttp3.ResponseBody;
import wu2.w;
import okhttp3.MultipartBody;
import java.util.Iterator;
import r20.d;
import a4.u1;
import nf2.c0;
import io.reactivex.plugins.RxJavaPlugins;
import sf2.o;
import nf2.g0;
import io.reactivex.internal.operators.single.SingleFlatMap;
import ch.b;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MultipartBody$Builder;
import com.reddit.data.model.mediaupload.ProgressRequestBody;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import com.reddit.domain.model.FileUploadResult;
import nf2.t;
import java.io.File;
import com.reddit.domain.model.FileUploadLease;
import java.util.List;
import javax.inject.Inject;
import ah2.f;
import com.reddit.data.remote.RemoteMediaUploadDataSource;
import r20.a;
import ge0.s;

public final class f1 implements s
{
    public final a a;
    public final RemoteMediaUploadDataSource b;
    
    @Inject
    public f1(final a a, final RemoteMediaUploadDataSource b) {
        f.f((Object)a, "backgroundThread");
        f.f((Object)b, "dataSource");
        this.a = a;
        this.b = b;
    }
    
    public final t<FileUploadResult> a(final String s, final List<FileUploadLease.Field> list, final File file, final String s2) {
        f.f((Object)s, "action");
        f.f((Object)list, "fields");
        f.f((Object)file, "file");
        f.f((Object)s2, "fileMimeType");
        final ProgressRequestBody progressRequestBody = new ProgressRequestBody(RequestBody.Companion.create(file, MediaType.Companion.get(s2)));
        final MultipartBody$Builder multipartBody$Builder = new MultipartBody$Builder((String)null, 1, (DefaultConstructorMarker)null);
        final ArrayList list2 = new ArrayList();
        for (final FileUploadLease.Field next : list) {
            if (next.value != null) {
                list2.add(next);
            }
        }
        for (final FileUploadLease.Field field : list2) {
            final String name = field.name;
            final String value = field.value;
            f.c((Object)value);
            multipartBody$Builder.addFormDataPart(name, value);
        }
        multipartBody$Builder.addFormDataPart("file", file.getName(), (RequestBody)progressRequestBody);
        final MultipartBody build = multipartBody$Builder.build();
        final RemoteMediaUploadDataSource b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("https:");
        sb.append(s);
        final c0<w<ResponseBody>> uploadFile = b.uploadFile(sb.toString(), build);
        final b b2 = new b(10);
        uploadFile.getClass();
        final c0 w = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)uploadFile, (o)b2)).w((o)new n0(3));
        f.e((Object)w, "dataSource\n      .upload\u2026 FileUploadResult\n      }");
        final c0 j1 = u1.j1(w, (d)this.a);
        final t map = progressRequestBody.getProgress().map((o)new d1(4));
        f.e((Object)map, "fileRequestBody.progress\u2026 FileUploadResult\n      }");
        final t mergeWith = eg.n0.G0(map, this.a).mergeWith((g0)j1);
        f.e((Object)mergeWith, "progress\n      .mergeWith(upload)");
        return (t<FileUploadResult>)eg.n0.G0(mergeWith, this.a);
    }
}
