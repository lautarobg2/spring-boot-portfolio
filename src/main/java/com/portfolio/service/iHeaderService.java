
package com.portfolio.service;

import com.portfolio.model.Header;
import java.util.List;


public interface iHeaderService {
    
    public List<Header> obtenerHeaderInfo();
    
    public void modificarHeader(Header header);
    
}
