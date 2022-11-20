// 
// Decompiled by Procyon v0.6.0
// 

package u92;

import com.reddit.screen.BaseScreen;
import android.widget.ImageButton;
import ug2.k;
import com.bluelinelabs.conductor.Controller;
import com.reddit.vault.feature.vault.burn.BurnEducationScreen;
import y92.o;
import com.reddit.vault.feature.vault.membership.cancel.CancelMembershipPresenter;
import com.reddit.vault.feature.vault.membership.cancel.CancelMembershipScreen;
import com.reddit.vault.feature.vault.transaction.detail.widget.TransactionDetailLayout;
import com.reddit.vault.feature.vault.transfer.TransferPresenter;
import mg.d0;
import com.reddit.vault.feature.vault.transfer.TransferScreen;
import com.reddit.video.creation.player.MediaPlayerViewHolder;
import com.reddit.video.creation.player.MediaPlayerMVP$Presenter;
import com.reddit.video.creation.widgets.adjustclips.view.AdjustClipsFragment;
import com.reddit.video.creation.widgets.edit.view.EditTextOverlayDialog;
import com.reddit.video.creation.widgets.preview.PreviewImageFragment;
import com.reddit.video.creation.widgets.uploaduservideos.view.UploadUserVideosBottomSheetDialogFragment;
import lb2.b;
import com.reddit.widgets.CurrencyAmountSelectorView;
import ng2.e;
import com.reddit.wiki.wiki.WikiScreen;
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;
import android.view.View;
import android.view.View$OnClickListener;

public final class a implements View$OnClickListener
{
    public final int f;
    public final Object g;
    
    public a(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void onClick(final View view) {
        switch (this.f) {
            default: {
                final TimePickerDialog timePickerDialog = (TimePickerDialog)this.g;
                final int h0 = TimePickerDialog.h0;
                timePickerDialog.z0(true, false, true, 1);
                timePickerDialog.H0();
                return;
            }
            case 12: {
                final WikiScreen wikiScreen = (WikiScreen)this.g;
                e.f((Object)wikiScreen, "this$0");
                ((BaseScreen)wikiScreen).d();
                return;
            }
            case 11: {
                CurrencyAmountSelectorView.b((CurrencyAmountSelectorView)this.g);
                return;
            }
            case 10: {
                final b b = (b)this.g;
                e.f((Object)b, "this$0");
                b.a.invoke();
                return;
            }
            case 9: {
                UploadUserVideosBottomSheetDialogFragment.q0((UploadUserVideosBottomSheetDialogFragment)this.g, view);
                return;
            }
            case 8: {
                PreviewImageFragment.p0((PreviewImageFragment)this.g, view);
                return;
            }
            case 7: {
                EditTextOverlayDialog.s0((EditTextOverlayDialog)this.g, view);
                return;
            }
            case 6: {
                AdjustClipsFragment.y0((AdjustClipsFragment)this.g, view);
                return;
            }
            case 5: {
                MediaPlayerViewHolder.S0((MediaPlayerMVP$Presenter)this.g, view);
                return;
            }
            case 4: {
                final TransferScreen transferScreen = (TransferScreen)this.g;
                final k[] n0 = TransferScreen.n0;
                e.f((Object)transferScreen, "this$0");
                final ImageButton j = transferScreen.zC().j;
                e.e((Object)j, "binding.networkFeeInfoButton");
                d0.e0((View)j);
                ((TransferPresenter)transferScreen.AC()).x.D();
                return;
            }
            case 3: {
                TransactionDetailLayout.a((TransactionDetailLayout)this.g);
                return;
            }
            case 2: {
                final CancelMembershipScreen cancelMembershipScreen = (CancelMembershipScreen)this.g;
                final k[] n2 = CancelMembershipScreen.n0;
                e.f((Object)cancelMembershipScreen, "this$0");
                final da2.b i0 = cancelMembershipScreen.i0;
                if (i0 != null) {
                    ((CancelMembershipPresenter)i0).vb(false);
                    return;
                }
                e.n("presenter");
                throw null;
            }
            case 1: {
                final o o = (o)this.g;
                final int h2 = y92.o.h;
                e.f((Object)o, "this$0");
                o.g.Q2();
                return;
            }
            case 0: {
                final BurnEducationScreen burnEducationScreen = (BurnEducationScreen)this.g;
                e.f((Object)burnEducationScreen, "this$0");
                ((Controller)burnEducationScreen).p.B((Controller)burnEducationScreen);
            }
        }
    }
}
