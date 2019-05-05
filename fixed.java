import java.util.Arrays;

public class fixed {
	double[] row_01, row_02, row_03, row_11, row_22, row_33, row_44, row_55, row_66,row_77,row_88,row_99;
	double a, b, c, d, e, f, g, h, i, j, k;
	double aa, bb, cc, dd, ee, ff, gg, hh, ii, jj, kk;
	double aa2, bb2, cc2, dd2, ee2, ff2, gg2, hh2, ii2, jj2, kk2;

	public fixed() {
		row_01 = new double[] { 2.4615, 1.9286, 0.3333, 1.2797 };
		row_02 = new double[] { 1.1212, 1.1410, 0.1477, 1.3497 };
		row_03 = new double[] { 1.9924, 1.3604, 0.9537, 0.3349 };
		// double[] least = new double[]{row_01[3],row_02[3],row_03[3]};

		row_11 = new double[] { 2.4615, 1.9286, 0.3333, -1, 1, 0, 0, 0, 0, 0, 1.2797 };
		row_22 = new double[] { 1.1212, 1.1410, 0.1477, 0, 0, -1, 1, 0, 0, 0, 1.3497 };
		row_33 = new double[] { 1.9924, 1.3604, 0.9537, 0, 0, 0, 0, -1, 1, 0, 0.3349 };

		double big = Arrays.stream(row_01).reduce((x, y) -> x > y ? x : y).getAsDouble();

		fetchPivotEquation();
	}

	// fetching all the pivot points == (old pivot equation)/(pivot element)
	private void fetchPivotEquation() {
		a = row_33[0] / row_33[0];
		b = row_33[1] / row_33[0];
		c = row_33[2] / row_33[0];
		d = row_33[3] / row_33[0];
		e = row_33[4] / row_33[0];
		f = row_33[5] / row_33[0];
		g = row_33[6] / row_33[0];
		h = row_33[7] / row_33[0];
		i = row_33[8] / row_33[0];
		j = row_33[9] / row_33[0];
		k = row_33[10] / row_33[0];
		// System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+h+"\n"+i+"\n"+j+"\n"+k);

		// derives Accessory equation New Acc equation = Old Acc equation – (Entering
		// column) × New pivot equation
		double piv = row_11[0] - row_11[0] * a;
		double piv_01 = row_11[1] - row_11[0] * b;
		double piv_02 = row_11[2] - row_11[0] * c;
		double piv_03 = row_11[3] - row_11[0] * d;
		double piv_04 = row_11[4] - row_11[0] * e;
		double piv_05 = row_11[5] - row_11[0] * f;
		double piv_06 = row_11[6] - row_11[0] * g;
		double piv_07 = row_11[7] - row_11[0] * h;
		double piv_08 = row_11[8] - row_11[0] * i;
		double piv_09 = row_11[9] - row_11[0] * j;
		double piv_10 = row_11[10] - row_11[0] * k;
		// System.out.println(piv+"\n"+piv_01+"\n"+piv_02+"\n"+piv_03+"\n"+piv_04+"\n"+piv_05+"\n"+piv_06+"\n"+piv_07+"\n"+piv_08+"\n"+piv_09+"\n"+piv_10);

		// derives Spare parts equation New Acc equation = Old Acc equation – (Entering
		// column) × New pivot equation
		double pv = row_22[0] - row_22[0] * a;
		double pv_01 = row_22[1] - row_22[0] * b;
		double pv_02 = row_22[2] - row_22[0] * c;
		double pv_03 = row_22[3] - row_22[0] * d;
		double pv_04 = row_22[4] - row_22[0] * e;
		double pv_05 = row_22[5] - row_22[0] * f;
		double pv_06 = row_22[6] - row_22[0] * g;
		double pv_07 = row_22[7] - row_22[0] * h;
		double pv_08 = row_22[8] - row_22[0] * i;
		double pv_09 = row_22[9] - row_22[0] * j;
		double pv_10 = row_22[10] - row_22[0] * k;
		// System.out.println(pv + "\n" + pv_01 + "\n" + pv_02 + "\n" + pv_03 + "\n" +
		// pv_04 + "\n" + pv_05 + "\n" + pv_06
		// + "\n" + pv_07 + "\n" + pv_08 + "\n" + pv_09 + "\n" + pv_10);

		// create table 02
		row_44 = new double[] { piv, piv_01, piv_02, piv_03, piv_04, piv_05, piv_06, piv_07, piv_08, piv_09, piv_10 };
		row_55 = new double[] { pv, pv_01, pv_02, pv_03, pv_04, pv_05, pv_06, pv_07, pv_08, pv_09, pv_10 };
		row_66 = new double[] { a, b, c, d, e, f, g, h, i, j, k };
		
		
		aa = row_44[0] / row_44[7];
		bb = row_44[1] / row_44[7];
		cc = row_44[2] / row_44[7];
		dd = row_44[3] / row_44[7];
		ee = row_44[4] / row_44[7];
		ff = row_44[5] / row_44[7];
		gg = row_44[6] / row_44[7];
		hh = row_44[7] / row_44[7];
		ii = row_44[8] / row_44[7];
		jj = row_44[9] / row_44[7];
		kk = row_44[10] / row_44[7];
		//System.out.println(aa+"\n"+bb+"\n"+cc+"\n"+dd+"\n"+ee+"\n"+ff+"\n"+gg+"\n"+hh+"\n"+ii+"\n"+jj+"\n"+kk);
		
		
		//spp
		double pvv = row_55[0] - row_55[7] * aa;
		double pvv_01 = row_55[1] - row_55[7] * bb;
		double pvv_02 = row_55[2] - row_55[7] * cc;
		double pvv_03 = row_55[3] - row_55[7] * dd;
		double pvv_04 = row_55[4] - row_55[7] * ee;
		double pvv_05 = row_55[5] - row_55[7] * ff;
		double pvv_06 = row_55[6] - row_55[7] * gg;
		double pvv_07 = row_55[7] - row_55[7] * hh;
		double pvv_08 = row_55[8] - row_55[7] * ii;
		double pvv_09 = row_55[9] - row_55[7] * jj;
		double pvv_10 = row_55[10] - row_55[7] * kk;
		//System.out.println(pvv + "\n" + pvv_01 + "\n" + pvv_02 + "\n" + pvv_03 + "\n" +
		//pvv_04 + "\n" + pvv_05 + "\n" + pvv_06
		//	 + "\n" + pvv_07 + "\n" + pvv_08 + "\n" + pvv_09 + "\n" + pvv_10);
		
		//misc
		double pvvs = row_66[0] - row_66[7] * aa;
		double pvvs_01 = row_66[1] - row_66[7] * bb;
		double pvvs_02 = row_66[2] - row_66[7] * cc;
		double pvvs_03 = row_66[3] - row_66[7] * dd;
		double pvvs_04 = row_66[4] - row_66[7] * ee;
		double pvvs_05 = row_66[5] - row_66[7] * ff;
		double pvvs_06 = row_66[6] - row_66[7] * gg;
		double pvvs_07 = row_66[7] - row_66[7] * hh;
		double pvvs_08 = row_66[8] - row_66[7] * ii;
		double pvvs_09 = row_66[9] - row_66[7] * jj;
		double pvvs_10 = row_66[10] - row_66[7] * kk;
		
	 //System.out.println(pvvs + "\n" + pvvs_01 + "\n" + pvvs_02 + "\n" + pvvs_03 + "\n" +
			// pvvs_04 + "\n" + pvvs_05 + "\n" + pvvs_06
				// + "\n" + pvvs_07 + "\n" + pvvs_08 + "\n" + pvvs_09 + "\n" + pvvs_10);
	 
	 //compute table 3
	 row_77 = new double[]{aa, bb, cc, dd, ee, ff, gg, hh, ii, jj, kk};
	row_88 = new double[]{pvv, pvv_01, pvv_02, pvv_03, pvv_04, pvv_05, pvv_06, pvv_07, pvv_08, pvv_09, pvv_10};
	row_99 = new double[]{pvvs, pvvs_01, pvvs_02, pvvs_03, pvvs_04, pvvs_05, pvvs_06, pvvs_07, pvvs_08, pvvs_09, pvvs_10};
	
	//pivot
	 aa2 = row_88[0] / row_88[3];
	bb2 = row_88[1] / row_88[3];
	cc2 = row_88[2] / row_88[3];
	dd2 = row_88[3] / row_88[3];
	ee2 = row_88[4] / row_88[3];
	ff2 = row_88[5] / row_88[3];
	gg2 = row_88[6] / row_88[3];
	hh2 = row_88[7] / row_88[3];
	ii2 = row_88[8] / row_88[3];
	jj2 = row_88[9] / row_88[3];
	kk2 = row_88[10] / row_88[3]; 	
	System.out.println(aa2+"\n"+bb2+"\n"+cc2+"\n"+dd2+"\n"+ee2+"\n"+ff2+"\n"+gg2+"\n"+hh2+"\n"+ii2+"\n"+jj2+"\n"+kk2);
	
	
	//d4
	double pvvss = row_77[0] - row_77[3] * aa2;
	double pvvss_01 = row_77[1] - row_77[3] * bb2;
	double pvvss_02 = row_77[2] - row_77[3] * cc2;
	double pvvss_03 = row_77[3] - row_77[3] * dd2;
	double pvvss_04 = row_77[4] - row_77[3] * ee2;
	double pvvss_05 = row_77[5] - row_77[3] * ff2;
	double pvvss_06 = row_77[6] - row_77[3] * gg2;
	double pvvss_07 = row_77[7] - row_77[3] * hh2;
	double pvvss_08 = row_77[8] - row_77[3] * ii2;
	double pvvss_09 = row_77[9] - row_77[3] * jj2;
	double pvvss_10 = row_77[10] - row_77[3] * kk2;
	
 System.out.println(pvvss + "\n" + pvvss_01 + "\n" + pvvss_02 + "\n" + pvvss_03 + "\n" +
		 pvvss_04 + "\n" + pvvss_05 + "\n" + pvvss_06
			 + "\n" + pvvss_07 + "\n" + pvvss_08 + "\n" + pvvss_09 + "\n" + pvvss_10);
	
	double pvvsst = row_99[0] - row_99[3] * aa2;
	double pvvsst_01 = row_99[1] - row_99[3] * bb2;
	double pvvsst_02 = row_99[2] - row_99[3] * cc2;
	double pvvsst_03 = row_99[3] - row_99[3] * dd2;
	double pvvsst_04 = row_99[4] - row_99[3] * ee2;
	double pvvsst_05 = row_99[5] - row_99[3] * ff2;
	double pvvsst_06 = row_99[6] - row_99[3] * gg2;
	double pvvsst_07 = row_99[7] - row_99[3] * hh2;
	double pvvsst_08 = row_99[8] - row_99[3] * ii2;
	double pvvsst_09 = row_99[9] - row_99[3] * jj2;
	double pvvsst_10 = row_99[10] - row_99[3] * kk2;
	
 System.out.println(pvvsst + "\n" + pvvsst_01 + "\n" + pvvsst_02 + "\n" + pvvsst_03 + "\n" +
		pvvsst_04 + "\n" + pvvsst_05 + "\n" + pvvsst_06
			 + "\n" + pvvsst_07 + "\n" + pvvsst_08 + "\n" + pvvsst_09 + "\n" + pvvsst_10);
	}

	

	public static void main(String[] args) {
		new fixed();
	}
}
