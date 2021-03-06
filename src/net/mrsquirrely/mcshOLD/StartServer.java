/*
 * Copyright (C) 2016 James <MrSquirrely.net>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.mrsquirrely.mcshOLD;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author James <MrSquirrely.net>
 */
public class StartServer implements Runnable{
    
    String version;
    
    @Override
    public void run() {
        try {
            //This is going to get better!
            this.version = StartScreenController.MCVersion;
            Process proc = Runtime.getRuntime().exec("java -jar MCServer" + version + ".jar");
        } catch (IOException ex) {
            Logger.getLogger(StartServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
