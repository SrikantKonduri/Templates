int getLength(ListNode head){
  if(head == null){
    return 0;
  }
  else if(head.next == null){
    return 1;
  }
  return 1 + getLength(head.next);
}
