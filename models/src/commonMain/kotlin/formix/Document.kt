package formix

import kollections.List

interface Document {
    val uid: String
    val name: String
    val pages: List<Page>
    val fields: List<DocumentField>
    val deleted: Boolean
}
