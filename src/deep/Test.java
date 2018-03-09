/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package deep;


/**
 * @author eason.li
 *
 */
public class Test {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng copy = (QiTianDaSheng)qiTianDaSheng.clone();
            System.out.println(qiTianDaSheng.jinGuBang == copy.jinGuBang);
        } catch(CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
