// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.uploaduservideos.view;

import android.widget.CheckedTextView;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable$ConstantState;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import com.reddit.video.creation.widgets.utils.ImageViewUtils;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.graphics.drawable.StateListDrawable;
import j30.w;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import android.view.View;
import com.reddit.video.creation.widgets.uploaduservideos.model.LocalUserVideo;
import javax.inject.Inject;
import n3.a;
import android.view.LayoutInflater;
import ng2.e;
import android.view.ViewGroup;
import com.google.auto.factory.Provided;
import com.reddit.video.creation.api.configuration.ThemeProvider;
import com.reddit.video.creation.widgets.uploaduservideos.presenter.UploadUserVideosPresenter;
import android.graphics.drawable.ColorDrawable;
import cg2.f;
import kotlin.Metadata;
import com.google.auto.factory.AutoFactory;
import androidx.recyclerview.widget.RecyclerView$f0;

@AutoFactory
@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006 " }, d2 = { "Lcom/reddit/video/creation/widgets/uploaduservideos/view/LocalVideoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "isChecked", "", "selectionNumber", "Lcg2/j;", "bindCheckedState", "(ZLjava/lang/Integer;)V", "Lcom/reddit/video/creation/widgets/uploaduservideos/model/LocalUserVideo;", "localVideo", "showDuration", "bind", "Lcom/reddit/video/creation/widgets/uploaduservideos/presenter/UploadUserVideosPresenter;", "presenter", "Lcom/reddit/video/creation/widgets/uploaduservideos/presenter/UploadUserVideosPresenter;", "Lcom/reddit/video/creation/api/configuration/ThemeProvider;", "themeProvider", "Lcom/reddit/video/creation/api/configuration/ThemeProvider;", "Landroid/graphics/drawable/ColorDrawable;", "placeholder", "Landroid/graphics/drawable/ColorDrawable;", "Lj30/w;", "binding$delegate", "Lcg2/f;", "getBinding", "()Lj30/w;", "binding", "Landroid/view/ViewGroup;", "parentContainer", "<init>", "(Lcom/reddit/video/creation/widgets/uploaduservideos/presenter/UploadUserVideosPresenter;Lcom/reddit/video/creation/api/configuration/ThemeProvider;Landroid/view/ViewGroup;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class LocalVideoViewHolder extends RecyclerView$f0
{
    private final f binding$delegate;
    private final ColorDrawable placeholder;
    private final UploadUserVideosPresenter presenter;
    private final ThemeProvider themeProvider;
    
    @Inject
    public LocalVideoViewHolder(@Provided final UploadUserVideosPresenter presenter, @Provided final ThemeProvider themeProvider, final ViewGroup viewGroup) {
        e.f((Object)presenter, "presenter");
        e.f((Object)themeProvider, "themeProvider");
        e.f((Object)viewGroup, "parentContainer");
        super(LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131624521, viewGroup, false));
        this.presenter = presenter;
        this.themeProvider = themeProvider;
        this.placeholder = new ColorDrawable(a.getColor(super.itemView.getContext(), 2131100618));
        this.binding$delegate = kotlin.a.b((mg2.a)new LocalVideoViewHolder$binding$2(this));
    }
    
    public static void S0(final LocalVideoViewHolder localVideoViewHolder, final LocalUserVideo localUserVideo, final View view) {
        bind$lambda-0(localVideoViewHolder, localUserVideo, view);
    }
    
    public static void bind$default(final LocalVideoViewHolder localVideoViewHolder, final LocalUserVideo localUserVideo, boolean b, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            b = true;
        }
        localVideoViewHolder.bind(localUserVideo, b);
    }
    
    private static final void bind$lambda-0(final LocalVideoViewHolder localVideoViewHolder, final LocalUserVideo localUserVideo, final View view) {
        e.f((Object)localVideoViewHolder, "this$0");
        e.f((Object)localUserVideo, "$localVideo");
        localVideoViewHolder.presenter.onLocalVideoToggle(localUserVideo);
    }
    
    private final void bindCheckedState(final boolean checked, final Integer n) {
        final AppCompatCheckedTextView d = this.getBinding().d;
        String string;
        if (n != null) {
            string = n.toString();
        }
        else {
            string = null;
        }
        String text = string;
        if (string == null) {
            text = "";
        }
        ((TextView)d).setText((CharSequence)text);
        ((CheckedTextView)this.getBinding().d).setChecked(checked);
        final FrameLayout e = this.getBinding().e;
        ng2.e.e((Object)e, "binding.viewSelectedOverlay");
        int visibility;
        if (checked) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)e).setVisibility(visibility);
    }
    
    private final w getBinding() {
        return (w)this.binding$delegate.getValue();
    }
    
    public final void bind(final LocalUserVideo localUserVideo, final boolean b) {
        e.f((Object)localUserVideo, "localVideo");
        final Drawable background = ((View)this.getBinding().d).getBackground();
        e.d((Object)background, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        final Drawable$ConstantState constantState = ((Drawable)background).getConstantState();
        e.d((Object)constantState, "null cannot be cast to non-null type android.graphics.drawable.DrawableContainer.DrawableContainerState");
        final Drawable[] children = ((DrawableContainer$DrawableContainerState)constantState).getChildren();
        int visibility = 0;
        final Drawable drawable = children[0];
        e.d((Object)drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable)drawable).setColor(this.themeProvider.getTheme().getButtonsThemeConfig().getRegular().getBackgroundColor());
        final ImageView b2 = this.getBinding().b;
        e.e((Object)b2, "binding.ivThumbnail");
        ImageViewUtils.loadPhotoFromUrlWithPlaceHolder$default(b2, localUserVideo.getPreviewUri(), (Drawable)this.placeholder, (Drawable)null, 4, (Object)null);
        super.itemView.setOnClickListener((View$OnClickListener)new on1.a(19, (Object)this, (Object)localUserVideo));
        this.bindCheckedState(localUserVideo.isChecked(), localUserVideo.getSelectionOrderNumber());
        this.getBinding().c.setText((CharSequence)localUserVideo.getUserReadableTime());
        final TextView c = this.getBinding().c;
        e.e((Object)c, "binding.tvDuration");
        if (!b) {
            visibility = 8;
        }
        ((View)c).setVisibility(visibility);
    }
}
