/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting.management;

/**
 *
 * @author Adity
 */
class VoteCounter {

    private String partyname;
    int id, count;

    public VoteCounter(int id, String partyname, int count) {
        this.id = id;
        this.partyname = partyname;
        this.count = count;

    }

    public int getid() {
        return id;
    }

    public String getpatyname() {
        return partyname;
    }

    public int getcount() {
        return count;
    }

}
