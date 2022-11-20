// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.edit.presenter;

import com.reddit.video.creation.widgets.edit.view.GoBackView;
import com.reddit.video.creation.widgets.edit.view.SaveVideoView;
import com.reddit.video.creation.widgets.base.AbstractPresenter;
import af2.t;
import android.os.Bundle;
import mg2.l;
import io.reactivex.rxkotlin.SubscribersKt;
import ff2.o;
import jj0.h;
import java.util.Arrays;
import android.os.Build$VERSION;
import com.reddit.video.creation.analytics.ScreenVisible;
import com.reddit.video.creation.analytics.screen.ScreenId;
import java.util.Iterator;
import mg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import gg2.c;
import com.reddit.video.creation.models.recording.ImageInfo;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.video.creation.models.sticker.TextOverlayInfo;
import java.util.ArrayList;
import dg2.m;
import com.reddit.video.creation.widgets.base.BaseMVPView;
import com.reddit.video.creation.widgets.base.BaseMVPView$DefaultImpls;
import h.d;
import com.reddit.video.creation.analytics.Analytics;
import com.reddit.video.creation.analytics.Tap;
import com.reddit.video.creation.analytics.TapTarget;
import com.reddit.video.creation.widgets.utils.StringUtils;
import android.graphics.Bitmap;
import af2.c0;
import cg2.j;
import com.reddit.video.creation.io.MediaFileInteractor$FileType;
import com.reddit.video.creation.widgets.utils.image.BitmapUtils;
import com.reddit.video.creation.analytics.FlowType;
import com.reddit.video.creation.eventbus.EventBus$NavigationEvent;
import com.reddit.video.creation.eventbus.EventBus$NavigationEvent$OpenCropImageFragment;
import com.reddit.video.creation.widgets.edit.CropImageExtras;
import com.reddit.video.creation.video.utils.VideoCacheHelper;
import af2.g0;
import kotlin.Pair;
import javax.inject.Inject;
import ng2.e;
import javax.inject.Named;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.io.File;
import com.reddit.video.creation.io.MediaFileInteractor;
import com.reddit.video.creation.eventbus.EventBus;
import com.reddit.video.creation.widgets.edit.EditImageExtras;
import com.reddit.video.creation.widgets.widget.cropView.aspectRatiosList.model.AspectRatio;
import com.reddit.video.creation.api.configuration.CreationConfiguration;
import android.content.Context;
import kotlin.Metadata;
import com.reddit.video.creation.widgets.utils.di.scopes.FragmentScope;
import com.reddit.video.creation.widgets.edit.view.EditImageView;

@FragmentScope
@Metadata(bv = {}, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B5\b\u0007\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b1\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0006\u0010\t\u001a\u00020\u0003J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0006\u0010\u0012\u001a\u00020\u0003R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00064" }, d2 = { "Lcom/reddit/video/creation/widgets/edit/presenter/EditImagePresenter;", "Lcom/reddit/video/creation/widgets/edit/presenter/EditContentPresenter;", "Lcom/reddit/video/creation/widgets/edit/view/EditImageView;", "Lcg2/j;", "updateMainImage", "goToCropImage", "onUserPressedBack", "onResume", "onPostClicked", "onSaveClicked", "view", "Lcom/reddit/video/creation/widgets/edit/EditImageExtras;", "editImageExtras", "Landroid/os/Bundle;", "savedInstanceState", "viewCreated", "onAddOverlayClicked", "onAddDrawingClicked", "onCropClicked", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "Lcom/reddit/video/creation/eventbus/EventBus;", "eventBus", "Lcom/reddit/video/creation/eventbus/EventBus;", "getEventBus", "()Lcom/reddit/video/creation/eventbus/EventBus;", "Ljava/io/File;", "renderVideoDir", "Ljava/io/File;", "Lcom/reddit/video/creation/io/MediaFileInteractor;", "mediaFileInteractor", "Lcom/reddit/video/creation/io/MediaFileInteractor;", "Lcom/reddit/video/creation/api/configuration/CreationConfiguration;", "creationConfiguration", "Lcom/reddit/video/creation/api/configuration/CreationConfiguration;", "Lcom/reddit/video/creation/widgets/edit/EditImageExtras;", "", "modifiedImageUri", "Ljava/lang/String;", "Lcom/reddit/video/creation/widgets/widget/cropView/aspectRatiosList/model/AspectRatio;", "cropAspectRatio", "Lcom/reddit/video/creation/widgets/widget/cropView/aspectRatiosList/model/AspectRatio;", "", "cropWasUsed", "Z", "getCurrentImageUri", "()Ljava/lang/String;", "currentImageUri", "<init>", "(Landroid/content/Context;Lcom/reddit/video/creation/eventbus/EventBus;Ljava/io/File;Lcom/reddit/video/creation/io/MediaFileInteractor;Lcom/reddit/video/creation/api/configuration/CreationConfiguration;)V", "Companion", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class EditImagePresenter extends EditContentPresenter<EditImageView>
{
    public static final EditImagePresenter.EditImagePresenter$Companion Companion;
    public static final String IMAGE_FILE_PREFIX = "cropped-img-";
    public static final String IMAGE_FILE_SUFFIX = ".png";
    private final Context appContext;
    private final CreationConfiguration creationConfiguration;
    private AspectRatio cropAspectRatio;
    private boolean cropWasUsed;
    private EditImageExtras editImageExtras;
    private final EventBus eventBus;
    private final MediaFileInteractor mediaFileInteractor;
    private String modifiedImageUri;
    private final File renderVideoDir;
    
    static {
        Companion = new EditImagePresenter.EditImagePresenter$Companion((DefaultConstructorMarker)null);
    }
    
    @Inject
    public EditImagePresenter(@Named("APP_CONTEXT") final Context appContext, final EventBus eventBus, @Named("RENDER_VIDEO_DIR") final File renderVideoDir, final MediaFileInteractor mediaFileInteractor, final CreationConfiguration creationConfiguration) {
        e.f((Object)appContext, "appContext");
        e.f((Object)eventBus, "eventBus");
        e.f((Object)renderVideoDir, "renderVideoDir");
        e.f((Object)mediaFileInteractor, "mediaFileInteractor");
        e.f((Object)creationConfiguration, "creationConfiguration");
        super(eventBus);
        this.appContext = appContext;
        this.eventBus = eventBus;
        this.renderVideoDir = renderVideoDir;
        this.mediaFileInteractor = mediaFileInteractor;
        this.creationConfiguration = creationConfiguration;
    }
    
    public static final File access$getRenderVideoDir$p(final EditImagePresenter editImagePresenter) {
        return editImagePresenter.renderVideoDir;
    }
    
    public static final void access$setCropAspectRatio$p(final EditImagePresenter editImagePresenter, final AspectRatio cropAspectRatio) {
        editImagePresenter.cropAspectRatio = cropAspectRatio;
    }
    
    public static final void access$setCropWasUsed$p(final EditImagePresenter editImagePresenter, final boolean cropWasUsed) {
        editImagePresenter.cropWasUsed = cropWasUsed;
    }
    
    public static final void access$setModifiedImageUri$p(final EditImagePresenter editImagePresenter, final String modifiedImageUri) {
        editImagePresenter.modifiedImageUri = modifiedImageUri;
    }
    
    public static void e(final EditImagePresenter editImagePresenter) {
        onCropClicked$lambda-5(editImagePresenter);
    }
    
    public static g0 f(final EditImagePresenter editImagePresenter, final boolean b, final Pair pair) {
        return onSaveClicked$lambda-2(editImagePresenter, b, pair);
    }
    
    public static g0 g(final EditImageView editImageView, final EditImagePresenter editImagePresenter, final Integer n) {
        return onSaveClicked$lambda-4(editImageView, editImagePresenter, n);
    }
    
    private final String getCurrentImageUri() {
        String s;
        if ((s = this.modifiedImageUri) == null) {
            final EditImageExtras editImageExtras = this.editImageExtras;
            if (editImageExtras == null) {
                e.n("editImageExtras");
                throw null;
            }
            s = editImageExtras.getImageUri();
        }
        return s;
    }
    
    private final void goToCropImage() {
        final StringBuilder t = a.t("cropped-img-");
        t.append(System.currentTimeMillis());
        final String absolutePath = File.createTempFile(t.toString(), ".png", VideoCacheHelper.getVideoCacheDirectory(((AbstractPresenter)this).getContext())).getAbsolutePath();
        final EventBus eventBus = this.getEventBus();
        final EditImageExtras editImageExtras = this.editImageExtras;
        if (editImageExtras != null) {
            final String imageUri = editImageExtras.getImageUri();
            e.e((Object)absolutePath, "outputUri");
            eventBus.goToDestination((EventBus$NavigationEvent)new EventBus$NavigationEvent$OpenCropImageFragment(new CropImageExtras(imageUri, absolutePath)));
            return;
        }
        e.n("editImageExtras");
        throw null;
    }
    
    private static final void onCropClicked$lambda-5(final EditImagePresenter editImagePresenter) {
        e.f((Object)editImagePresenter, "this$0");
        editImagePresenter.goToCropImage();
    }
    
    private static final g0 onSaveClicked$lambda-2(final EditImagePresenter editImagePresenter, final boolean b, final Pair pair) {
        e.f((Object)editImagePresenter, "this$0");
        e.f((Object)pair, "<name for destructuring parameter 0>");
        return (g0)editImagePresenter.handlePermissionsGiven(-1, b, (boolean)pair.component1(), (boolean)pair.component2(), FlowType.IMAGE);
    }
    
    private static final g0 onSaveClicked$lambda-4(final EditImageView editImageView, final EditImagePresenter editImagePresenter, final Integer n) {
        e.f((Object)editImageView, "$view");
        e.f((Object)editImagePresenter, "this$0");
        e.f((Object)n, "it");
        final Bitmap thumbnail = editImageView.createThumbnail();
        if (thumbnail != null) {
            final String saveAsThumbnail = BitmapUtils.saveAsThumbnail(thumbnail, editImagePresenter.renderVideoDir);
            if (saveAsThumbnail != null) {
                editImagePresenter.mediaFileInteractor.saveFileToStorage(new File(saveAsThumbnail), MediaFileInteractor$FileType.JPEG);
                final j a = j.a;
                return (g0)c0.v(a);
            }
        }
        final j a = null;
        return (g0)c0.v(a);
    }
    
    private final void updateMainImage() {
        if (StringUtils.isGif(this.getCurrentImageUri())) {
            final EditImageView editImageView = (EditImageView)((AbstractPresenter)this).getView();
            if (editImageView != null) {
                editImageView.showGif(this.getCurrentImageUri());
            }
        }
        else {
            final EditImageView editImageView2 = (EditImageView)((AbstractPresenter)this).getView();
            if (editImageView2 != null) {
                editImageView2.showImage(this.getCurrentImageUri());
            }
        }
    }
    
    public EventBus getEventBus() {
        return this.eventBus;
    }
    
    public void onAddDrawingClicked() {
        super.onAddDrawingClicked();
        this.getEventBus().reportAnalytics((Analytics)new Tap(TapTarget.EDITING_OVERLAY_DRAW, FlowType.IMAGE));
    }
    
    public void onAddOverlayClicked() {
        super.onAddOverlayClicked();
        this.getEventBus().reportAnalytics((Analytics)new Tap(TapTarget.EDITING_OVERLAY_TEXT, FlowType.IMAGE));
    }
    
    public final void onCropClicked() {
        this.getEventBus().reportAnalytics((Analytics)new Tap(TapTarget.CROP, FlowType.IMAGE));
        if (this.getContentWasEdited()) {
            final EditImageView editImageView = (EditImageView)((AbstractPresenter)this).getView();
            if (editImageView != null) {
                BaseMVPView$DefaultImpls.showAlertDialog$default((BaseMVPView)editImageView, Integer.valueOf(2131953122), Integer.valueOf(2131954007), 2131951780, 2131956082, (Runnable)new d((Object)this, 28), (Runnable)null, (Integer)null, (Runnable)null, 192, (Object)null);
            }
        }
        else {
            this.goToCropImage();
        }
    }
    
    public void onPostClicked() {
        this.getEventBus().reportAnalytics((Analytics)new Tap(TapTarget.EDITING_POST, FlowType.IMAGE));
        final EditImageExtras editImageExtras = this.editImageExtras;
        if (editImageExtras == null) {
            e.n("editImageExtras");
            throw null;
        }
        final boolean wasFlashUsed = editImageExtras.getWasFlashUsed();
        final EditImageExtras editImageExtras2 = this.editImageExtras;
        if (editImageExtras2 != null) {
            final List l3 = cg.d.l3((Object)editImageExtras2.getLastFilterName());
            final List overlayInfos = this.getOverlayInfos();
            String s;
            if (overlayInfos != null) {
                final ArrayList list = new ArrayList<String>(m.u4((Iterable)overlayInfos, 10));
                final Iterator iterator = overlayInfos.iterator();
                while (iterator.hasNext()) {
                    list.add(((TextOverlayInfo)iterator.next()).getSpec().getText());
                }
                s = (String)CollectionsKt___CollectionsKt.e5((List)list);
            }
            else {
                s = null;
            }
            final List overlayInfos2 = this.getOverlayInfos();
            int size;
            if (overlayInfos2 != null) {
                size = overlayInfos2.size();
            }
            else {
                size = 0;
            }
            final ImageInfo imageInfo = new ImageInfo(wasFlashUsed, l3, s, size, this.getWasOverlayDrawUsed(), 1, String.valueOf(this.cropAspectRatio));
            if (!this.getContentWasEdited() && !this.cropWasUsed) {
                final EventBus eventBus = this.getEventBus();
                final EditImageExtras editImageExtras3 = this.editImageExtras;
                if (editImageExtras3 == null) {
                    e.n("editImageExtras");
                    throw null;
                }
                eventBus.setImageOutput(new File(editImageExtras3.getImageUri()), imageInfo);
            }
            else {
                g.g(((AbstractPresenter)this).getMainScope(), null, null, (p)new EditImagePresenter$onPostClicked$1(this, imageInfo, (c)null), 3);
            }
            return;
        }
        e.n("editImageExtras");
        throw null;
    }
    
    public void onResume() {
        super.onResume();
        this.getEventBus().reportAnalytics((Analytics)new ScreenVisible(ScreenId.CAMERA_EDIT, (String)null, FlowType.IMAGE, 2, (DefaultConstructorMarker)null));
    }
    
    public final void onSaveClicked() {
        this.getEventBus().reportAnalytics((Analytics)new Tap(TapTarget.EDITING_SAVE, (FlowType)null, 2, (DefaultConstructorMarker)null));
        final int sdk_INT = Build$VERSION.SDK_INT;
        String[] array;
        if (sdk_INT >= 33) {
            array = new String[] { "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO" };
        }
        else if (sdk_INT >= 29) {
            array = new String[] { "android.permission.READ_EXTERNAL_STORAGE" };
        }
        else {
            array = new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" };
        }
        final EditImageView editImageView = (EditImageView)((AbstractPresenter)this).getView();
        if (editImageView == null) {
            return;
        }
        ((SaveVideoView)editImageView).showSaveLoader();
        final int length = array.length;
        boolean b = false;
        while (true) {
            for (int i = 0; i < length; ++i) {
                if (!((BaseMVPView)editImageView).checkPermission(array[i])) {
                    final c0 y = ((BaseMVPView)editImageView).requestPermission((String[])Arrays.copyOf(array, array.length)).observeOn(cf2.a.a()).flatMapSingle((o)new h((Object)this, b, 2)).observeOn(zf2.a.b()).flatMapSingle((o)new com.reddit.accountutil.a(18, (Object)editImageView, (Object)this)).take(1L).singleOrError().y(cf2.a.a());
                    e.e((Object)y, "view.requestPermission(*\u2026dSchedulers.mainThread())");
                    p7.a.e(((AbstractPresenter)this).getCompositeDisposable(), (df2.a)SubscribersKt.g((c0)y, (l)new EditImagePresenter$onSaveClicked.EditImagePresenter$onSaveClicked$3(this), (l)new EditImagePresenter$onSaveClicked.EditImagePresenter$onSaveClicked$4(this)));
                    return;
                }
            }
            b = true;
            continue;
        }
    }
    
    public void onUserPressedBack() {
        super.onUserPressedBack();
        final EditImageView editImageView = (EditImageView)((AbstractPresenter)this).getView();
        if (editImageView != null) {
            ((GoBackView)editImageView).cleanBackStack();
        }
        final EditImageView editImageView2 = (EditImageView)((AbstractPresenter)this).getView();
        if (editImageView2 != null) {
            ((GoBackView)editImageView2).goBack();
        }
    }
    
    public final void viewCreated(final EditImageView editImageView, final EditImageExtras editImageExtras, final Bundle bundle) {
        e.f((Object)editImageView, "view");
        e.f((Object)editImageExtras, "editImageExtras");
        super.viewCreated((BaseMVPView)editImageView);
        this.editImageExtras = editImageExtras;
        this.updateMainImage();
        final t observeOn = this.getEventBus().getCropImageResults().observeOn(cf2.a.a());
        e.e((Object)observeOn, "eventBus.cropImageResult\u2026dSchedulers.mainThread())");
        p7.a.e(((AbstractPresenter)this).getCompositeDisposable(), SubscribersKt.f((t)observeOn, (l)EditImagePresenter$viewCreated.EditImagePresenter$viewCreated$1.INSTANCE, SubscribersKt.c, (l)new EditImagePresenter$viewCreated.EditImagePresenter$viewCreated$2(this)));
        ((BaseMVPView)editImageView).setUITheme(this.creationConfiguration.getTheme());
    }
}
