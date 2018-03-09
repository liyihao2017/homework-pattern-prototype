/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author eason.li
 *
 */
public class QiTianDaSheng extends Monkey implements Serializable,Cloneable{

    private static final long serialVersionUID = -5976454031214375258L;
    
    public JinGuBang jinGuBang;
    
    public QiTianDaSheng() {
        this.jinGuBang = new JinGuBang();
    }
    
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return deepClone();
    }
    
    
    public Object deepClone() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            
            return copy;
            
        } catch(Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
    
    
}
