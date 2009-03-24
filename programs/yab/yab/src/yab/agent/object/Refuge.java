// Copyright (C) 2002 Takeshi Morimoto <morimoto@takopen.cs.uec.ac.jp>
// All rights reserved.
package yab.agent.object;

import yab.agent.DisasterSpace;
import yab.io.object.*;

public class Refuge extends Building {
    public Refuge(int id, DisasterSpace world)
    { super(id, new BaseRefuge(id), world); }
    private BaseRefuge obj() { return (BaseRefuge)object; }
}
