// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import com.bytedance.covode.number.Covode;
import android.view.View;

public final class 1ij<T extends View & 0fi> extends 1JC<T> implements a, 0fi
{
    public final 1JJ LIZ;
    
    static {
        Covode.recordClassIndex(6133);
    }
    
    public 1ij(final T t) {
        super(t);
        this.LIZ = new 1JJ((1JJ.a)this);
        t.setWillNotDraw(false);
    }
    
    public final void LIZ(final float lj) {
        final 1JJ liz = this.LIZ;
        liz.LJ = lj;
        liz.LJIILJJIL.LIZIZ();
    }
    
    public final void LIZ(final int n) {
        final 1JJ liz = this.LIZ;
        liz.LJFF = ColorStateList.valueOf(n);
        liz.LJIILJJIL.LIZIZ();
    }
    
    public final void LIZ(final int n, final int n2) {
        this.LIZ.LIZ(0, 0, n, n2);
    }
    
    public final void LIZ(final ColorStateList ljff) {
        final 1JJ liz = this.LIZ;
        liz.LJFF = ljff;
        liz.LJIILJJIL.LIZIZ();
    }
    
    @Override
    public final void LIZ(final TypedArray typedArray) {
        this.LIZ.LIZ(super.LIZLLL.getContext(), typedArray);
    }
    
    public final void LIZ(final Canvas canvas) {
        this.LIZ.LIZ(canvas);
    }
    
    public final void LIZ(final boolean liz) {
        final 1JJ liz2 = this.LIZ;
        liz2.LIZ = liz;
        liz2.LIZJ();
        liz2.LJIILJJIL.LIZIZ();
    }
    
    public final void LIZ(final int[] array) {
        this.LIZ.LIZ(array, null);
    }
    
    @Override
    public final int[] LIZ() {
        return new int[] { 16843165, 16843166, 16843275, 2130969140, 2130969142, 2130969145, 2130969147, 2130969275, 2130969609, 2130969610, 2130969611, 2130970787, 2130971118, 2130971119, 2130971276, 2130971278, 2130971281, 2130971283 };
    }
    
    @Override
    public final void LIZIZ() {
        super.LIZLLL.invalidate();
    }
    
    public final void LIZIZ(final float lji) {
        final 1JJ liz = this.LIZ;
        liz.LJI = lji;
        liz.LIZJ();
        liz.LJIILJJIL.LIZIZ();
    }
    
    public final void LIZIZ(final int ljiiliil) {
        final 1JJ liz = this.LIZ;
        liz.LJIILIIL = ljiiliil;
        liz.LIZIZ();
        liz.LJIILJJIL.LIZIZ();
    }
    
    public final void LIZIZ(final Canvas canvas) {
        this.LIZ.LIZIZ(canvas);
    }
    
    public final void LIZIZ(final boolean liziz) {
        final 1JJ liz = this.LIZ;
        liz.LIZIZ = liziz;
        liz.LIZJ();
        liz.LJIILJJIL.LIZIZ();
    }
    
    public final void LIZJ(final float ljii) {
        final 1JJ liz = this.LIZ;
        liz.LJII = ljii;
        liz.LIZJ();
        liz.LJIILJJIL.LIZIZ();
    }
    
    public final void LIZJ(final int n) {
        this.LIZLLL(n);
    }
    
    public final void LIZJ(final Canvas canvas) {
        this.LIZ.LIZJ(canvas);
    }
    
    public final void LIZJ(final boolean lizj) {
        final 1JJ liz = this.LIZ;
        liz.LIZJ = lizj;
        liz.LIZJ();
        liz.LJIILJJIL.LIZIZ();
    }
    
    @Override
    public final boolean LIZJ() {
        return super.LIZLLL.getLayoutDirection() == 1;
    }
    
    public final void LIZLLL(final float ljiiiizz) {
        final 1JJ liz = this.LIZ;
        liz.LJIIIIZZ = ljiiiizz;
        liz.LIZJ();
        liz.LJIILJJIL.LIZIZ();
    }
    
    public final void LIZLLL(final boolean lizlll) {
        final 1JJ liz = this.LIZ;
        liz.LIZLLL = lizlll;
        liz.LIZJ();
        liz.LJIILJJIL.LIZIZ();
    }
    
    @Override
    public final int[] LIZLLL() {
        return super.LIZLLL.getDrawableState();
    }
    
    public final float LJ() {
        return this.LIZ.LJII;
    }
    
    public final void LJ(final float ljiiiz) {
        final 1JJ liz = this.LIZ;
        liz.LJIIIZ = ljiiiz;
        liz.LIZJ();
        liz.LJIILJJIL.LIZIZ();
    }
    
    public final float LJFF() {
        return this.LIZ.LJIIIIZZ;
    }
    
    public final void LJFF(final float ljiij) {
        final 1JJ liz = this.LIZ;
        liz.LJIIJ = ljiij;
        liz.LIZJ();
        liz.LJIILJJIL.LIZIZ();
    }
    
    public final float LJI() {
        return this.LIZ.LJIIIZ;
    }
    
    public final float LJII() {
        return this.LIZ.LJIIJ;
    }
    
    public final float LJIIIIZZ() {
        return this.LIZ.LJ;
    }
    
    public final ColorStateList LJIIIZ() {
        return this.LIZ.LJFF;
    }
    
    public final float LJIIJ() {
        return this.LIZ.LJI;
    }
    
    public final int[] LJIIJJI() {
        return this.LIZ.LJIIJJI;
    }
    
    public final float[] LJIIL() {
        return this.LIZ.LJIIL;
    }
    
    @Override
    public final void setCircular(final boolean circular) {
        this.LIZ.setCircular(circular);
    }
}
