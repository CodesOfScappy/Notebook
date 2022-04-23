package com.example.scappy;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter
{

    public TabsAccessorAdapter(FragmentManager fm)
    {
        super(fm);
    }


    /*
    * Hier werden die Fragment-Layouts in die Toolbar hinzugefügt
    *  -WICHTIG- es beginnt IMMER mit Case 0: und kann bis zu 5 Case´s fassen
    * damit es Slide fähig ist benutze ich Funktion switch (i)
    * dabei ist switch (i) eine kürzung ...siehe unten !
     */
    @Override
    public Fragment getItem(int i)
    {
        switch (i)
        {
            case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;

            case 1:
                GroupsFragment groupsFragment = new GroupsFragment();
                return groupsFragment;

            case 2:
                ContactsFragment contactsFragment = new ContactsFragment();
                return contactsFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return 3;
    }

    /*
     * Hier bekommen die Fragment-TABS einen Namen zugewießen.
     * Der Name wird später als Fragment-Layout in der Toolbar Erscheinen.
     * -WICHTIG- beginn IMMER mit CASE 0: und switch zum Slide Modus.
     * Hier das Beispiel von SWITCH....  --> switch (position) <-- ausgeschrieben!
      */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Chats";


            case 1:
                return "Groups";


            case 2:
                return "Contacts";


            default:
                return null;
        }
    }
}
