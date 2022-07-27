package com.vookiretailfsm.features.NewQuotation

import android.net.Uri
import com.vookiretailfsm.BuildConfig
import com.vookiretailfsm.R
import com.itextpdf.text.*
import com.itextpdf.text.pdf.ColumnText
import com.itextpdf.text.pdf.PdfPageEventHelper
import com.itextpdf.text.pdf.PdfWriter
import java.io.IOException


class HeaderFooterPageEvent : PdfPageEventHelper() {

    override fun onStartPage(writer: PdfWriter?, document: Document?) {
        //super.onStartPage(writer, document)
        ColumnText.showTextAligned(writer!!.getDirectContent(), Element.ALIGN_CENTER,  Phrase("Top Left"), 30f, 800f, 0f);
        ColumnText.showTextAligned(writer!!.getDirectContent(), Element.ALIGN_CENTER,  Phrase("Top Right"), 550f, 800f, 0f);
    }

    override fun onEndPage(writer: PdfWriter?, document: Document?) {
        //super.onEndPage(writer, document)
        ColumnText.showTextAligned(writer!!.getDirectContent(), Element.ALIGN_CENTER,  Phrase(""), 110f, 30f, 0f);
        ColumnText.showTextAligned(writer!!.getDirectContent(), Element.ALIGN_CENTER,  Phrase("page " + document!!.getPageNumber()), 550f, 30f, 0f);
    }
}