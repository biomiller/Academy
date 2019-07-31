import React from 'react';
import { Item } from './Item.js';


export function ItemList(props) {

  return (
    <div>
      {props.data.map(item => (
        <Item
          key={item._id}
          email={props.email}
          username={props.username}
          data={item}
          getAllItems={props.getAllItems}
        />
      ))
      }
    </div>

  );
}